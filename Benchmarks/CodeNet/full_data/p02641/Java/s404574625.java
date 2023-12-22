import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        int[] q = new int[102];
        for(int i=0; i<N; i++){
            p[i] = sc.nextInt();
            q[p[i]] = 1; 
        }
        int minDif = 1000;
        int ans = X;
        for(int i = 0; i<=101; i++){
            if(q[i] == 0){
                if(Math.abs(X-i) < minDif){
                    ans = i;
                    minDif = Math.abs(X-i);
                }
            }
        }
        System.out.println(ans);
    }
}