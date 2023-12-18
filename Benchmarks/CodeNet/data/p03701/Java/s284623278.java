import java.util.Arrays;
import java.util.Scanner;

public class Main{
    void solve(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            s[i] = in.nextInt();
            sum += s[i];
        }
        
        if(sum % 10 != 0){
            System.out.println(sum);
        }else{
            Arrays.sort(s);
            for(int i = 0; i < n; i++){
                if((sum - s[i])%10 != 0){
                    System.out.println(sum - s[i]);
                    return;
                }
                sum-=s[i];
            }
        }
        System.out.println(0);
    }
    
    public static void main(String[] args){
        new Main().solve();
    }
}