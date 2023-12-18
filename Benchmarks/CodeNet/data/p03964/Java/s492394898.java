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
            if(curA > a || curB > b) {
                int rate = Math.max((curA + a - 1) / a, (curB + b - 1) / b);
                a = a * rate;
                b = b * rate;
            }
            curA = a;
            curB = b;
        }
        
        System.out.println(curA + curB);
    }
}
