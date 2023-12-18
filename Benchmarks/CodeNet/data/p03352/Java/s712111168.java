import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = (int)Math.pow(n,0.5)+1;
        int ans = 1;
        for(int i = 2; i < max; i++){
            int pow = 2;
            while(Math.pow(i,pow) <= n){
                ans = Math.max(ans,(int)Math.pow(i,pow));
                pow++;
            }
        }
        System.out.println(ans);
    }
}

