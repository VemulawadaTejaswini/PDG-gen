import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        question.solve(sc);
    }

    static class Question {
        boolean isLumLum(long num) {
            long prev = num % 10;
            num /= 10;
            while(num > 0) {
                long t = num % 10;
                if(Math.abs(t - prev) > 1) return false;
                num /= 10;
                prev = t;
            }
            return true;
        }

        public void solve(Scanner sc) {
            int n = sc.nextInt();
            for(long num = 1; n > 0; num++) {
                if(isLumLum(num)) {
                    n--;
                    if(n == 0) System.out.println(num);
                }
            }
        }
    }
}
