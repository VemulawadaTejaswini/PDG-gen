import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            final Character[] a = {'a', 'e', 'i', 'o', 'u'};

            System.out.println(
                Arrays.asList(a).contains(
                    s.charAt(0)) ? "vowel" : "consonant");
        }
    }
}
