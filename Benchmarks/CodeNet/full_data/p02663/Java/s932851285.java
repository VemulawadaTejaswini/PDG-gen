import java.util.*;

public class Main {
    public static int gcd(int num1,int num2) {
        if(num2==0) return num1;
        else return gcd(num2,num1%num2);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();
        int T1 = H1 * 60 + M1;
        int T2 = H2 * 60 + M2;
        int result = T2 - T1 - K;
        System.out.println(result);
    }
}
