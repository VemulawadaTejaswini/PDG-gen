import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        int ans=1;
        
        for(int i=1; i<n; i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                ans++;
            }
        }
        
        System.out.println(ans);
   }
}
