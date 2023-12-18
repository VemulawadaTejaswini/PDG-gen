package Contest122;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();

        char A = line.charAt(0);

        switch (A) {
        case 'A':
            System.out.println("T");
            break;

        case 'T':
            System.out.println("A");
            break;

        case 'G':
            System.out.println("C");
            break;

        case 'C':
            System.out.println("G");
            break;

        }

    }
}