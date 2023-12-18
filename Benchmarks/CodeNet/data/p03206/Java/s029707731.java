package jp.atcoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    /**
     * @author subaru
     */
    public static void main(String[] args) throws IOException {
        Integer d = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
        String message = "Christmas";
        for (int i = 0; i < 25 - d; i++) {
            message += " Eve";
        }
        System.out.println(message);
    }
}
