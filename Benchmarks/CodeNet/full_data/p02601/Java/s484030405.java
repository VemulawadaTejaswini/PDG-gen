import java.util.*;
public class Main {
    
    static void solve(){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();        
        int B = sc.nextInt();        
        int C = sc.nextInt();        
        int K = sc.nextInt();        
        int count = 0;
        while(true){ 
            if(count>K) break;
            if(B<=A) {B*=2; count++;}
            else break;
        }
        while(true) {    
            if(count>K) break;
            if(C<=B) {C*=2; count++;}
            else break;
        }
        System.out.println((count<=K) ? "Yes" : "No");
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}