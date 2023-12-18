import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] lineOne = new int[n];
        int[] lineTwo = new int[n];

        for (int i = 0; i < n; i++) {
            lineOne[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            lineTwo[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    sum += lineOne[j];
                }
                if (j >= i) {
                    sum += lineTwo[j];
                }
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }

}