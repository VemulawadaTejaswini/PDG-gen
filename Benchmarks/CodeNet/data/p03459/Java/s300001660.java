import static java.lang.Math.*;
import java.util.Scanner;

public class Main {
        
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int [] t = new int[N+1];
            int [] x = new int[N+1];
            int [] y = new int[N+1];
            t[0] = 0;
            x[0] = 0;
            y[0] = 0;
            for (int i=1; i<=N; i++){
                t[i] = scanner.nextInt();
                x[i] = scanner.nextInt();
                y[i] = scanner.nextInt();
            }
            Boolean judge = true;
            int i = 1;
            while ((i <= N) && judge) {
                //System.out.println(t[i]+" "+x[i]+" "+y[i]);
                //System.out.println(abs(x[i]-x[i-1])+" "+abs(y[i]-y[i-1])+" "+(t[i]-t[i-1]-2));
                int dist = abs(x[i]-x[i-1])+abs(y[i]-y[i-1]);
                int step = abs(t[i]-t[i-1]);
                if (step < dist) judge=false;
                else if (step == dist) judge=true;
                else if (((step - dist)%2) == 0) judge=true;
                else judge = false;
                i++;
            }
            if (judge) System.out.println("Yes");
            else System.out.println("No");
        }   
}