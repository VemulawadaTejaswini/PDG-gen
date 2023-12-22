import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        MyWriter writer = new MyWriter();
        Reader inputReader = new InputStreamReader(System.in);
        Scanner reader = new Scanner(inputReader);
        reader.useDelimiter("\n");

        CipherReader cipherReader = new CipherReader();
        cipherReader.addKeyword("the");
        cipherReader.addKeyword("this");
        cipherReader.addKeyword("that");

        while (reader.hasNext()) {
            final String line = reader.next();

            writer.write(cipherReader.read(line) + "\n");
        }

        writer.print();
    }

}

class Method {

    static final char WORD_BEGIN = 'a';
    static final char WORD_END = 'z';
    static final int WORD_RANGE = WORD_END - WORD_BEGIN + 1;

    private Method(){}

    public static int positiveRemain(int divident, int divisor) {
        int result = divident % divisor;
        if (result < 0) {
            result += divisor;
        }

        return result;
    }

    public static String displace(String text, int count) {
        if (count == 0) { return text; }

        String result = "";

        for (char word : text.toCharArray()) {
            char newWord;
            if (WORD_BEGIN <= word && word <= WORD_END) {
                newWord = (char) (positiveRemain(word - WORD_BEGIN + count, WORD_RANGE) + WORD_BEGIN);
            } else {
                newWord = word;
            }
            result += newWord;
        }

        return result;
    }

}

class CipherReader {

    private List<String> keywords;
    private static int OUT_OF_RANGE = Integer.MAX_VALUE;

    public CipherReader() {
        keywords = new ArrayList<String>();
    }

    public void addKeyword(String word) {
        keywords.add(word);
    }

    public String read(String cipherText) {
        final int shift = getShiftCount(cipherText);
        if (shift == OUT_OF_RANGE) { return null; }

        return Method.displace(cipherText, shift);
    }

    private int getShiftCount(String text) {
        String[] words = text.split("[ .]");

        for (final String word : words) {
            final int wordsLength = word.length();
            for (final String keyword : this.keywords) {
                if (wordsLength != keyword.length()) { continue; }

                final int shift = keyword.compareTo(word);
                if (!Method.displace(word, shift).equals(keyword)) { continue; }

                return shift;
            }
        }

        return OUT_OF_RANGE;
    }

}

// Not important

class MyWriter {
    private StringBuilder stringBuilder;
    public MyWriter() {
        this.stringBuilder = new StringBuilder();
    }
    public <T> void write(T text) {
        this.stringBuilder.append(text);
    }
    public void print() {
        System.out.print(stringBuilder);
    }
}