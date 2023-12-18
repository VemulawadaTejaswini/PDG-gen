import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt() - (i + 1);
        }
        Arrays.sort(array);
        long median = 0;
        if(n % 2 == 0) {
            median = (array[n / 2] + array[n / 2 + 1]) / 2;
        } else {
            median = array[(int)Math.floor(n/2)];
        }
        long min = 0;
        for(int i = 0; i < n; i++) {
            min += Math.abs(array[i] - median);
        }
        System.out.println(min);
    }
}