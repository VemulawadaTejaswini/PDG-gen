import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question question = new Question();
        question.solve(sc);
    }

    static class Question {

        public void solve(Scanner sc) {
            int n = sc.nextInt();
            Queue<Long> q = new ArrayDeque<>();
            for(long i = 1; i < 10; ++i) {
                q.offer(i);
            }
            long res = 0;
            while(n-- > 0) {
                res = q.poll();
                long t = res % 10;
                if(t != 0) q.offer(res * 10 + t - 1);
                q.offer(res * 10 + t);
                if(t != 9) q.offer(res * 10 + t + 1);
            }
            System.out.println(res);
        }
    }
}
