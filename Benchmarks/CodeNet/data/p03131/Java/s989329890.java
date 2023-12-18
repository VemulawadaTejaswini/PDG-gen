import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b - a > 1){
            int k2 = k - (a - 1);
            if(k2 > 0){
                long t = a;
                for (int i = 0;i < k2 / 2;++i){
                    t += b - a;
                }
                if(k2 % 2 == 1)++t;
                System.out.println(t);
            }
            else System.out.println(k + 1);
        }
        else System.out.println(k + 1);
    }

}


