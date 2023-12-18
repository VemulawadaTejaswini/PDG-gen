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
            int m = sc.nextInt();
            int o = sc.nextInt();
            System.out.printf("%d %d %d", o, n, m);
        }
    }
}
