import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long a = sc.nextLong();
        
        for (int i=1; i<n; i++){
            long tt = sc.nextLong();
            long aa = sc.nextLong();
            long c = Math.max(t/tt,a/aa);
            while (tt*c < t || aa*c < a)
                c++;
            t = tt*c;
            a = aa*c;
        }
        System.out.println(t+a);
        
    }

}
