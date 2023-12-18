import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] d = new int[n];
        int[] c = new int[n];

        for(int i=0; i<n; i++) {
            d[i] = sc.nextInt();
            c[d[i]]++;
        }

        if(c[0] != 1 || d[0] != 0) {
            System.out.println(0);
            return;
        }

        long res = 1;
        long mod = 998244353;

        int sum = 1;
        for(int i=1; i<n; i++) {
            long a = 1;
            for(int j=0; j<c[i]; j++) {
                res *= c[i-1];
                res %= mod;
            }
        }

        System.out.println(res);

    }


}
