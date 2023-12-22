
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int[] lines = new int[Integer.parseInt(in.readLine())];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = i + 1;
        }

        int count = 1;
        count = Integer.parseInt(in.readLine());

        while (count-- > 0) {
            String[] s = in.readLine().split(",");
            swap(lines, Integer.parseInt(s[0]) - 1, Integer.parseInt(s[1]) - 1);
        }
        for (int i : lines) {
            System.out.println(i);
        }
        //*/
    }

    private static void swap(int[] lines, int a, int b) {
        int temp = lines[a];
        lines[a] = lines[b];
        lines[b] = temp;
    }
}