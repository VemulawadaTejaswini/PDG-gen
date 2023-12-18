import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> rightAnswers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int wrong = 0;
        int right = 0;

        for (int i = 0; i < m; i++) {
            int problem = sc.nextInt();
            String answer = sc.next();
            if (answer.equals("AC")) {
                if (!rightAnswers.contains(problem)) {
                    right++;
                    rightAnswers.add(problem);
                }
            } else {
                if (!rightAnswers.contains(problem)) {
                    wrong++;
                }
            }
        }
        System.out.println(right + " " + wrong);
    }
}