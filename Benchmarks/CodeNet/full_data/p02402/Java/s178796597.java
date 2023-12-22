import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int min,max;
        long sum;
        min = (int)Math.pow(10,7);
        max = -(int)Math.pow(10,7);
        sum = 0;
        for (int i = 0; i < n; i++){
            sum += a[i];
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
        }
        System.out.printf("%d %d %d\n",min,max,sum);
    }
}
