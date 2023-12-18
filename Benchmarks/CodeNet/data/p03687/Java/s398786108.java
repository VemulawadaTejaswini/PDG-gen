import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int min = 101;
        for (int i = 0; i < 26; i++) {
            boolean hit = false;
            int count = 0;
            int maxChain = 0;
            char target = (char) ('a' + i);
            for (char c : S.toCharArray()) {
                if (target == c) {
                    hit = true;
                    maxChain = Math.max(maxChain, count);
                    count = 0;
                } else {
                    count++;
                }
            }
            if (hit) {
                maxChain = Math.max(maxChain, count);
                if (maxChain != 0) {
                    min = Math.min(min, maxChain);
                }
            }
        }
        System.out.println(min);
    }
}