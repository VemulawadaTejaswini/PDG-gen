import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            int[] ans = new int[86401];
             
            for(int i=0;i<n;i++){
                String s = sc.next();
                String t = sc.next();
                int a = Integer.valueOf(s.substring(0,2))*3600 + Integer.valueOf(s.substring(3,5))*60 + Integer.valueOf(s.substring(6,8));
                int b = Integer.valueOf(t.substring(0,2))*3600 + Integer.valueOf(t.substring(3,5))*60 + Integer.valueOf(t.substring(6,8));  
                for(int j=a;j<b;j++) ans[j]++;
            }   
            Arrays.sort(ans);
            System.out.println(ans[86400]);
        }
    }
}