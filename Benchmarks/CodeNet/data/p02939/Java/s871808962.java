import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        State state = new State(line);
//        state.setDebugMode(true);

        state.readNextChar();
        State prevState = state.clone();
        state.cutWord();
        while (!state.isEndOfLine()) {
            state.readNextChar();
            if (state.isLegal()) {
                prevState = state.clone();
                state.cutWord();
            } else if (state.isEndOfLine()) {
                // The current position becomes the end of the line but the current word is still illegal.
                // Then, move back to the previous state.
                state = prevState;
                state.incrementMiniumCount();
            }
        }

        System.out.println(state.getCount());
        if (state.isDebugMode()) {
            System.out.println(state.getWordList());
        }
    }

}

class State {
    private int begin = 0;
    private int end = 0;
    private int count = 0;
    private int minimumCount = 1;
    private String line;
    private String prevWord;

    private boolean debugMode = false;
    private List<String> wordList = new ArrayList<>();

    public State(String line) {
        this.line = line;
    }

    public void cutWord() {
        prevWord = line.substring(begin, end);
        begin = end;
        minimumCount = 1;
        count++;
        if (debugMode) {
            wordList.add(prevWord);
        }
    }

    public boolean isEndOfLine() {
        return end == line.length();
    }

    public void readNextChar() {
        end++;
    }

    public boolean isLegal() {
        String currentWord = line.substring(begin, end);
        return currentWord.length() >= minimumCount && (prevWord == null || !prevWord.equals(currentWord));
    }

    public int getCount() {
        return count;
    }

    public State clone() {
        State newState = new State(line);
        newState.begin = begin;
        newState.end = end;
        newState.count = count;
        newState.minimumCount = minimumCount;
        newState.line = line;
        newState.prevWord = prevWord;
        newState.debugMode = debugMode;
        newState.wordList = new ArrayList<>(wordList);

        return newState;
    }

    public void incrementMiniumCount() {
        this.minimumCount++;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public List<String> getWordList() {
        return Collections.unmodifiableList(wordList);
    }
}