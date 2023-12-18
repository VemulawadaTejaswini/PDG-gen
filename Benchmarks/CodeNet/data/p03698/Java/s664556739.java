import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        MyReader reader = new MyReader();
        String s = reader.readString();
        System.out.println(problem063b(s));
    }

    private static String problem063b(String s) {
        List<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (charList.contains(c)) return "no";
            charList.add(c);
        }
        return "yes";
    }

    private static class MyReader {
        private final BufferedReader br;
        private MyReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        private String readString() throws IOException {
            return br.readLine();
        }

        private int readInt() throws IOException {
            return Integer.parseInt(readString());
        }

        private String[] readStrings(String regex) throws IOException {
            return readString().split(regex);
        }

        private int[] readInts(String regex) throws IOException {
            String[] strings = readStrings(regex);
            int[] ints = new int[strings.length];
            for (int i = 0; i < ints.length; i++) {
                ints[i] = Integer.parseInt(strings[i]);
            }
            return ints;
        }
    }
}