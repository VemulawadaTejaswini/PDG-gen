import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        int[] m = new int[n];
        for(int m0=0; m0<=Math.min(a[0], a[n-1]); m0++) {
            m[0] = m0;
            boolean isError = false;
            for(int i=1; i<n; i++) {
                m[i] = a[i-1]-m[i-1];
                if(m[i]<0) {
                    isError = true;
                    break;
                }
            }
            if(m[n-1]+m[0]!=a[n-1]) {
                continue;
            }
            if(!isError) {
                break;
            }
        }
        for(int i=0; i<n; i++) {
            System.out.print(m[i]*2);
            if(i<n-1) {
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
