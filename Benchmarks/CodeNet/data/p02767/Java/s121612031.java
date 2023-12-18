import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i=1; i<100; i++) {
            int sum = 0;
            for (int j=0; j<n; j++) {
                sum += Math.pow((double)(i - array[j]),2);
            }
            min = Math.min(min, sum);
        }
        System.out.println(min);
    }
}
