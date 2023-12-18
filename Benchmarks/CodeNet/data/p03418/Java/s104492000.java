import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        long res = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if(k == 0) {
            res = (long) n * n;
            System.out.println(res);
            return;
        }

        for(int b=k+1; b<=n; b++) {
            int div = (n+1) / b;
            int rem = (n+1) % b;
            long t = div * (b - k);
            t += Math.max(0, rem - k);
            res += t;
        }

        System.out.println(res);
    }

}
