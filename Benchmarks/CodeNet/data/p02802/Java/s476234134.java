import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int problems = sc.nextInt();
        int submissions = sc.nextInt();
        boolean[] isAC = new boolean[problems];

        int acCnt = 0;
        int waCnt = 0;

        for (int i = 0; i < submissions; i++) {
            int problemNum = sc.nextInt() - 1;
            String result = sc.next();

            if (result.equals("WA")) {
                waCnt++;
            } else {
                isAC[problemNum] = true;
            }
        }

        for (int i = 0; i < problems; i++) {
            if (isAC[i]) {
                acCnt++;
            }
        }

        System.out.println(acCnt + " " + waCnt);
    }
}
