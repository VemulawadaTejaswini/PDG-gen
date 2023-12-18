import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int cnt10000 = -1;
        int cnt5000  = -1;
        int cnt1000  = -1;
        for(int i=0; i<=n; i++) {
            for(int j=0; j<=n-i; j++) {
                int k = n-i-j;
                if(10000*i + 5000*j + 1000*k == y) {
                    cnt10000 = i;
                    cnt5000  = j;
                    cnt1000  = k;
                    System.out.println(Integer.toString(cnt10000) + " " +
                                       Integer.toString(cnt5000)  + " " +
                                       Integer.toString(cnt1000));
                    System.exit(0);
                }
            }
        }
        System.out.println(Integer.toString(cnt10000) + " " +
                           Integer.toString(cnt5000)  + " " +
                           Integer.toString(cnt1000));
    }
}
