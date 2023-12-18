import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 1;
        long chk = ans;
        while(chk < n){
            ans++;
            chk += ans;
        }
        System.out.println(ans);
    }
    
}