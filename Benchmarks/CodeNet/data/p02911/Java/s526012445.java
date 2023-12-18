import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] poinst = new int[n];
        for (int i = 0; i < poinst.length; i++){
            poinst[i] = k;
        }
        for(int i = 0; i < q ; i++) {
            int a = in.nextInt();
            for (int j = 0; j < poinst.length; j++){
                if(a - 1 == j) continue;
                poinst[j] = poinst[j] - 1;
            }
        }
        for(int i = 0; i < poinst.length; i++) {
            if(poinst[i] > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
