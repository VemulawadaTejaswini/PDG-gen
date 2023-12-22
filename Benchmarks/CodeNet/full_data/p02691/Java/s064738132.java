import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0;i < a.length;i++) a[i] = sc.nextLong();
        
        long count = 0;
        for(int i = 0;i < n;i++) {
            long tmp = a[i] + i;
            for(int j = i + 1;j < n;j++) {
                long k = tmp + a[j];
                if(k == j) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
