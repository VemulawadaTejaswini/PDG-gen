import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] T = new int[N];
        int[] P = new int[N];
        
        for(int i = 0 ; i< N ; i++){
            T[i] = sc.nextInt();
            P[i] = sc.nextInt() + sc.nextInt();
        }
        
        for(int i = N - 1 ; i > 0 ; i--){
            int needT = T[i] - T[i - 1];
            int needP = P[i] - P[i - 1];
            //時間が余っていなければアウト
            if(needT < needP){
                break;
            }
            //つぶせる時間は偶数である
            if((needT - needP) % 2 == 1){
                break;
            }
            System.out.println("Yes");
            return;
            
        }
        System.out.println("No");
        
    }
}
