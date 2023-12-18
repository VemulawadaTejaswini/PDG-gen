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
            long sum = 0;
            while(n > 0) {
                if(n % 3 == 0 && n % 5 == 0 || n % 3 == 0 || n % 5 == 0) {
                    n--;
                    continue;
                }
                sum += n--;
            }
            System.out.println(sum);
        }
    }
}
