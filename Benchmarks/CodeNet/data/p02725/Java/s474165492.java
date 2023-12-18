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
            int len = sc.nextInt();
            int n = sc.nextInt();
            int[] distances = new int[n];
            for (int i = 0; i < n; ++i) {
                distances[i] = sc.nextInt();
            }
            int[] distanceFromPrev = new int[n];
            distanceFromPrev[0] = len - distances[n - 1] + distances[0];
            int max = distanceFromPrev[0];
            for (int i = 1; i < n; ++i) {
                distanceFromPrev[i] = distances[i] - distances[i - 1];
                max = Math.max(max, distanceFromPrev[i]);
            }
            System.out.println(len - max);
        }
    }
}
