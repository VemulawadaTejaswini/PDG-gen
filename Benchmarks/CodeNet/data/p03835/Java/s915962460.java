// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int K = scan.nextInt();
        int S = scan.nextInt();
        int ans = 0;
        for(int i = 0; i <= K; i++){
            for(int j = 0; j <= K; j++){
                for(int k = 0; k <= K; k++){
                    if(i+k+j == S){
                        ans++;
                    }else if(i+k+j > S){
                        break;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}