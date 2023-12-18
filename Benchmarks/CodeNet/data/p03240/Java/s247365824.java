import java.util.*;
import java.awt.*;
import static java.lang.System.*;
import static java.lang.Math.*;
public class Main {
    public static void main(String[]$) {
        Scanner sc = new Scanner(in);
        int n=sc.nextInt();
        int[] x=new int[n];
        int[] y=new int[n];
        int[] h=new int[n];
        for (int i = 0; i < n; i++) {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            if(h[i]!=0) {
                for (int j = 0; j < 101; j++) {
                    for (int k = 0; k < 101; k++) {
                        int H = h[i] + abs(x[i] - j) + abs(y[i] - k);
                        int judge = 0;
                        for (int l = 0; l < n; l++) {
                            if (h[l] == 0 || H == h[l] + abs(x[l] - j) + abs(y[l] - k)) judge++;
                        }
                        if (judge == n) {
                            out.println(j + " " + k + " " + H);
                            exit(0);
                        }
                    }
                }
            }
        }
    }
}