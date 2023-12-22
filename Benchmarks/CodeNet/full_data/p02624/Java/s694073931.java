import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int n = Integer.parseInt(sc.next());
            long ans = 0;

            Long[] list = new Long[n];
            for(int i = 0; i < n; i++) list[i] = (long)0;          

            for(int i = 1; i <= n; i++){
                for(int j = i; j <= n; j += i){
                    list[j - 1] += 1;
                }                
            }

            for(int i = 0; i < n; i++){
                ans += list[i]*(i + 1);
            }

            System.out.println(ans);

        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}