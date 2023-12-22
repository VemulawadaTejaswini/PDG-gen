import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[] l = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = sc.nextInt();
            }
            Arrays.sort(l);
            int sum = 0;
            for (int i = n-1 ,j=1; i >= 0; i--,j++) {
                if(j%m!=0) {
                    sum+=l[i];
                }
            }
            System.out.println(sum);
        }
    }
}
