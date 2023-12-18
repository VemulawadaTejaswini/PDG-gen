import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    execute();
    }

    private static void execute() throws IOException {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println(isHaiku(br.readLine().split(" ")));
    }

    public static String isHaiku(String[] sentences) {
        if (sentences.length != 3) {
            return "NO";
        }
        List<String> haiku = new LinkedList<>(Arrays.asList("5","7","5"));
        for (String str : sentences) {
            if (haiku.contains(str)) {
                haiku.remove(str);
            }
        }
        return haiku.isEmpty() ? "YES" : "NO";
    }
}