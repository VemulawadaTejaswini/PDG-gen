import java.util.*;
public class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        
        int max = 123456*2;
        
        int[] p = new int[max+1];
        for(int i=2; i<p.length; i++)p[i] = 1;
        for(int j=2; j<Math.sqrt(max)+1; j++){
            for(int i=j*2; i<max; i+=j){
                p[i] = 0;
            }
        }
        
        int n = sc.nextInt();
        while(n!=0){
            
            int ans = 0;
            for(int i=n+1; i<=n*2; i++){
                if(p[i]==1)ans++;
            }
            
            System.out.println(ans);
            
            n = sc.nextInt();
        }   
    }
}