//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            final String s = reader.readLine();

            int R = Integer.parseInt(s);
            if (R < 1200) {
                System.out.println("ABC");
            } else if (R < 2800) {
                System.out.println("ARC");
            } else {
                System.out.println("AGC");
            }
        }
    }
}
