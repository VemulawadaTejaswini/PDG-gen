import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    void solve(){
        int n;
        while((n = in.nextInt()) != 0){
            int ans = Integer.MAX_VALUE;
            for(int a = 0; a < 26; a++){
                for(int b = 0; b < 17; b++){
                    for(int c = 0; c < 11; c++){
                        int sum = 0;
                        sum += (a / 5 * 5) * 380 * 0.8  + a % 5 * 380;
                        sum += (b / 4 * 4) * 550 * 0.85 + b % 4 * 550;
                        sum += (c / 3 * 3) * 850 * 0.88 + c % 5 * 850;
                        if(200 * a + 300 * b + 500 * c == n){
                            ans = Math.min(ans, sum);
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}