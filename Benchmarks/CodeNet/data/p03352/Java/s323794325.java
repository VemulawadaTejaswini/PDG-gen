import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
    
    public static int solve(int n){
        int max = (int)Math.pow(n,0.5)+1;
        int ret = 1;
        for(int i = 2; i < max; i++){
            int pow = 2;
            while(Math.pow(i,pow) <= n){
                ret = Math.max(ret,(int)Math.pow(i,pow));
                pow++;
            }
        }
        return ret;
    }
}
