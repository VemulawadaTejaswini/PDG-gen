import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     long  n = sc.nextLong();
     int i = 0,j;
     long tmp = n;
     while(true){
       i++;
       if(tmp<=(int)Math.pow(26,i)){
          break;        
       }else{
         tmp-=(int)Math.pow(26,i);
       }
     }
     char[] ans = new char[100];
     for (j = 1;j<i;j++){
       n-=(int)Math.pow(26,j);
     }
     n--;
     int test;
     for(j=1;j<=i;j++){
       test = 26;
       ans[j-1] = 'a';
       ans[j-1] += n%test;
       n -= n%test;
       n /=test;
     }
     for(j=i-1;j>=0;j--){
       System.out.print(ans[j]);
     }
     
   }
   
}
