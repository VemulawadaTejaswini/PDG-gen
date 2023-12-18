import java.util.*;

public class  Main{
        public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
          int n = Integer.parseInt(sc.next());
          int s[] = new int[n];
          int flag=0;
          	
          for(int i=0;i<n;i++) s[i] = Integer.parseInt(sc.next());
          
          for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
               if(s[i]==s[j]){
                 flag=1;
                 break;
                }
             }
            if(flag==1) break;
          }
          if(flag==0) System.out.println("YES");
          else System.out.println("NO");
        }
}