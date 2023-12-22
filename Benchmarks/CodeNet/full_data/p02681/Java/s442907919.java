package com.company;

import java.io.PrintWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        if (s.length() + 1 == t.length()) {
            printWriter.println("Yes");
        }else {
            printWriter.println("No");
        }
        printWriter.flush();
        printWriter.flush();
    }

    private static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}
