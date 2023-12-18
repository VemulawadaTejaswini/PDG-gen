import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
        int k = in.nextInt();
        int answer;
        if (k==1)
        {
            answer = 0;
        } else {
            answer = n-k;
        }
        System.out.println(answer);
    }
}