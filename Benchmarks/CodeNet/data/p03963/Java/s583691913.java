import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int N = sc.nextInt();
        int K = sc.nextInt();
        double cnt = K * (Math.pow(K-1.0,N-1.0));
        System.out.println(cnt);
    }
}