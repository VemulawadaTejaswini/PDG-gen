package beginner.contest.bc175;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            String s = scanner.next();
            char current = s.charAt(0);
            int counter = 0;

            if (current == 'R') {
                counter++;
            }
            for (int i = 1; i < 3; i++) {
                char next = s.charAt(i);
                if (next == current && next == 'R') {
                    counter++;
                }
                current = next;
            }
            System.out.println(counter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
