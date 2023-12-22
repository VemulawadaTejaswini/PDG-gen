//package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        int input = Integer.valueOf(line);
        int a = input % 10;
        String ans = "";
        switch (a) {
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                ans = "hon";
                break;
            case 0:
            case 1:
            case 6:
            case 8:
                ans = "pon";
                break;
            case 3:
                ans = "bon";
                break;
        }
        System.out.println(ans);
    }
}