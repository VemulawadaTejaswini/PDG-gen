import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        List<boolean[]> answers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            x[i] = sc.hasNext() ? sc.nextInt() : 0;
            y[i] = sc.hasNext() ? sc.nextInt() : 0;
            answers.add(new boolean[n]);
            for (int j = 0; j < n; j++) {
                answers.get(i)[j] = (i == j);
            }
        }

        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean[] answer = answers.get(i);
                if (answer[j]) continue;
                if ((x[j] < x[i] && y[j] < y[i]) || (x[j] > x[i] && y[j] > y[i]))
                    if (j < i) counter += fillWithTrue(i, j, n, answers);
                    else {
                        answer[j] = true;
                        counter++;
                    }
            }
            System.out.println(counter);
            counter = 1;
        }
    }

    private static int fillWithTrue(int current, int target, int n, List<boolean[]> answer) {
        int counter = 0;
        for (int j = 0; j < n; j++) {
            if (answer.get(target)[j] && !answer.get(current)[j]) {
                answer.get(current)[j] = true;
                counter++;
            }
        }
        return counter;
    }
}
