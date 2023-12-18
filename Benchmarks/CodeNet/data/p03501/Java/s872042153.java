

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputstr = br.readLine().trim().split(" ");
        int a = Integer.parseInt(inputstr[0]) * Integer.parseInt(inputstr[1]);
        int b = Integer.parseInt(inputstr[2]);
        System.out.println(Math.min(a, b));
    }
}