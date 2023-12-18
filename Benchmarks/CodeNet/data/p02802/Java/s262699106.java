import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] problem = new int[m];
        String[] answer = new String[m];
        for (int i = 0; i < m; i++) {
            problem[i] = sc.nextInt();
            answer[i] = sc.next();
        }

        int problemNumber = 1;
        int correct = 0;
        int wrong = 0;
        for (int i = 0; i < m; i++) {
            if (answer[i].equals("WA") && problem[i] == problemNumber) {
                wrong++;
            } else if (answer[i].equals("AC") && problem[i] == problemNumber) {
                correct++;
                problemNumber++;
            }
        }
        System.out.println(correct + " " + wrong);
    }
}