import java.util.*;
 
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = 0;
        int X = 0;
        int Y = 0;
        int X_point = 0;
        int Y_point = 0;
        for (int i = 0; i < N; i++) {
            int dis = 0;
            int X_len = 0;
            int Y_len = 0;
            T = sc.nextInt();
            X = sc.nextInt();
            Y = sc.nextInt();
            X_point = X - X_point;
            Y_point = Y - Y_point;

            if(X_point < 0){
                X_len = -1 * X_point;
            }else{
                X_len = X_point;
            }
            if(Y_point < 0){
                Y_len = -1 * Y_point;
            }else{
                Y_len = Y_point;
            }
            dis = X_len + Y_len;
            if(dis > N){
                System.out.println("No");
                System.exit(0);
            }else if((dis - N) % 2 == 0){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}