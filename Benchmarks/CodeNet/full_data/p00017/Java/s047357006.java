import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        MyWriter writer = new MyWriter();
        MyReader reader = new MyReader();

        CipherReader cipherReader = new CipherReader();
        cipherReader.addKeyword("the");
        cipherReader.addKeyword("this");
        cipherReader.addKeyword("that");

        reader.setDelim("");
        while (reader.isReadable()) {
            final String line = reader.read();

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

    public CipherReader() {
        keywords = new ArrayList<String>();
    }

    public void addKeyword(String word) {
        keywords.add(word);
    }

    public String read(String cipherText) {
        final int shift = getShiftCount(cipherText);
        if (shift == -1) { return null; }

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

        return -1;
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
class MyReader {
    private BufferedReader reader;
    private String line;
    private String delim;
    private static final String defaultDelim = " ";
    private static final String specialDelim = "\t\n\r\f";
    public MyReader() {
        Reader inputReader = new InputStreamReader(System.in);
        this.reader = new BufferedReader(inputReader);
        this.line = "";
        initDelim();
    }
    public boolean isReadable() throws IOException {
        if (this.line.length() != 0) { return true; }
        this.line = reader.readLine();
        return line != null;
    }
    public Integer readInt() throws IOException {
        return Integer.parseInt(read());
    }
    public Double readDouble() throws IOException {
        return Double.parseDouble(read());
    }
    public String read() throws IOException {
        if (!isReadable()) { throw new IOException(); }
        String[] strings = line.split("[" + this.delim + "]", 2);
        if (strings.length == 1) {
            line = "";
            return strings[0];
        }
        line = strings[0];
        return strings[1];
    }
    public int readInt(String delim) throws IOException {
        setDelim(delim);
        return readInt();
    }
    public double readDouble(String delim) throws IOException {
        setDelim(delim);
        return readDouble();
    }
    public String read(String delim) throws IOException {
        setDelim(delim);
        return read();
    }
    public void initDelim() {
        this.delim = defaultDelim + specialDelim;
    }
    public void setDelim(String delim) {
        if (delim == null) {
            initDelim();
            return;
        }

        this.delim = delim + specialDelim;
    }
}