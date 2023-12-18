import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int r = 0;
        for(int i=0; i<n; i++) {
            long sum = 0;
            for(int j=i; j<n; j++) {
                sum += a[j];
                if(sum % k == j-i+1) {
                    r++;
                }
            }
        }
        System.out.println(r);
    }
}
