import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       System.out.println(lucas(n));
    }
    
    public static long lucas(int n){
        long ans = 0;
        long L_2 = 2;
        long L_1 = 1;
       if(n==0) return 2;
       else if(n==1) return 1;
       else{
           for (int i=0;i<n-1;i++){
               ans = L_2 + L_1;
               L_2 = L_1;
               L_1 = ans;
           }
           return ans;
       }
    }
}