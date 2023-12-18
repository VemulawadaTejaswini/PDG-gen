import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        question.solve(sc);
    }

    static class Question {

        public int gcd(int a, int b) {
            return a == 0 ? b : gcd(b % a, a);
        }

        public void solve(Scanner sc) {
            int n = sc.nextInt();
            long sum = 0;
            for(int i = 1; i <= n; ++i) {
                for(int j = 1; j <= n; ++j) {
                    for(int k = 1; k <= n; ++k) {
                        int num = gcd(i, gcd(j, k));
                        sum += num;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
