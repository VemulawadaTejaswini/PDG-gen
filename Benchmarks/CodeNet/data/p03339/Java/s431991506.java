import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String S = sc.nextLine();
        String[] sarray = S.split("");
        int[] sumArray = new int[sarray.length + 1];
        sumArray[0] = 0;

        int wCount = 0;
        for (int i = 0; i < sarray.length; i++) {
            if (sarray[i].equals("W")) {
                wCount++;
            }
            sumArray[i + 1] = wCount;
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < N; j++) {
            int eastSideLength = N - j - 1;
            int westCount = sumArray[N] - sumArray[j + 1];
            int eastSideCount = eastSideLength - westCount;
            int val = sumArray[j] + eastSideCount;
            if (val <= min) {
                min = val;
                if (val == 0) {
                    break;
                }
            }
        }

        sc.close();

        System.out.println(min);
    }

}