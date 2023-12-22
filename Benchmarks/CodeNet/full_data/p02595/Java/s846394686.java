import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int x[] = new int[N];
        int y[] = new int[N];
        int d[] = new int[N];
        int count = 0;
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            d[i] = x[i]*x[i] + y[i]*y[i];
            double ans = Math.sqrt(d[i]);
            if(ans <= D){
                count++;
            }
        }
        //System.out.print(x[3]);
        //System.out.print(y[3]);
        //System.out.println(D);
        System.out.println(count);
    }
}
