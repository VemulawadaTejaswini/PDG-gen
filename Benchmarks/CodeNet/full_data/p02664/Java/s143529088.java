import java.util.*;

class Main {

    static class State {
        int index;
        char currentChar;
        State previousState;
        int count;
    }

    static final char[] P_D = new char[]{'P', 'D'};
    static final char[] P = new char[]{'P'};
    static final char[] D = new char[]{'D'};

    public static void main(String[] args) throws Exception {

        String T;
        try (Scanner scanner = new Scanner(System.in)) {
            T = scanner.next();
        } catch (Exception e) {
            throw e;
        }

        int score = 0;
        State result = new State(){{
            index = -1;
            currentChar = 0;
            previousState = null;
            count = 0;
        }};
        final ArrayDeque<State> states = new ArrayDeque<>();
        states.push(result);
        while (!states.isEmpty()) {
            final State state = states.pop();

            if (state.index+1 >= T.length()) continue;

            char[] charCandidates;
            if (T.charAt(state.index+1) == '?') {
                charCandidates = P_D;
            } else if (T.charAt(state.index+1) == 'P') {
                charCandidates = P;
            } else {
                charCandidates = D;
            }

            for (char c: charCandidates) {
                State newState = new State();
                newState.index = state.index+1;
                newState.currentChar = c;
                newState.previousState = state;
                newState.count = state.count;
                if (c == 'D') {
                    newState.count++;
                }
                if (newState.index >= 1 && state.currentChar == 'P' && c == 'D') {
                    newState.count++;
                }
                if (newState.count >= score && newState.index == T.length()-1) {
                    result = newState;
                    score = newState.count;
                }
                states.push(newState);
            }
        }

        State current = result;
        List<Character> characters = new ArrayList<>();
        while (current.previousState != null) {
            characters.add(current.currentChar);
            current = current.previousState;
        }
        for (int i = characters.size()-1; i >= 0; i--) {
            System.out.write(characters.get(i));
        }
        System.out.println();
    }
}