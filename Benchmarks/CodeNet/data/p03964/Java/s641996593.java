import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int curA = sc.nextInt();
        int curB = sc.nextInt();
        int a = 0, b = 0;
        for(int i = 1; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            int rate = Math.max((curA + a - 1) / a, (curB + b - 1) / b);
            int resA = a;
            int resB = b;
            if(curA > resA || curB > resB) {
                resA = a * rate;
                resB = b * rate;
            }
            curA = resA;
            curB = resB;
        }
        
        System.out.println(curA + curB);
    }
}
