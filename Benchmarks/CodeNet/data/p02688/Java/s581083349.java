import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        boolean[] snuke = new boolean[N];
        for(int i = 0 ; i < N ; i++){
            snuke[i] = true;
        }

        for(int i = 0 ; i < K ; i++){
            int d = sc.nextInt();
            for(int j = 0 ; j < d ; j++){
                snuke[sc.nextInt()-1] = false;
            }
        }

        int ans = 0;
        for(int i = 0 ; i < N ; i++){
            if(snuke[i]){
                ans++;
            }
        }

        System.out.println(ans);
    }
}
