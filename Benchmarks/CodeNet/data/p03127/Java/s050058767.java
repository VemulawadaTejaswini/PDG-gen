import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int res = a[0];
        for(int i=1; i<n; i++) {
            res = div(res, a[i]);
        }

        System.out.println(res);
    }

    static int div(int a, int b) {
        int c = Math.max(a, b);
        int d = Math.min(a, b);
        if(c % d == 0) return d;
        return div(d, c % d);
    }
}
