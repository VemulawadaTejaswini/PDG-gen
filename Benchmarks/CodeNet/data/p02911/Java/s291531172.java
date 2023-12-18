import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sankaNum = sc.next();
        String startPoint = sc.next();
        String correctAnswer = sc.next();
        String[] correctUsers = new String[Integer.parseInt(correctAnswer)];
        for (int i = 0; i < Integer.parseInt(correctAnswer); i++) {
            correctUsers[i] = sc.next();
        }

        int lifePoint = Integer.parseInt(startPoint) - Integer.parseInt(correctAnswer);
        int[] points = new int[Integer.parseInt(sankaNum)];

        for (int i = 0; i < Integer.parseInt(correctAnswer); i++) {
            points[Integer.parseInt(correctUsers[i] )- 1]++;
        }

        for (int i = 0; i < points.length; i++) {
            points[i] += lifePoint;
            System.out.println(points[i] > 0 ? "Yes" : "No");
        }
    }
}
