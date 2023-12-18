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
            System.out.println((n / 500) * 1000 + ((n % 500) / 5) * 5);
        }
    }
}
