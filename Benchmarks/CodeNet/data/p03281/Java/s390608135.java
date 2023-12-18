import java.util.Scanner;
public class Main{
   public static void main(String[] args){
     int n = new Scanner(System.in).nextInt();
     int i, j;
     int ans=0, temp=0;
     for(i=1;i<=n;i+=2){
       for(j=1;j<=i;j++){
         if(i%j==0){
           temp++;
         }
       }
       if(temp==8){
         ans++;
       }
       temp=0;
     }
     System.out.println(ans);
   }
}
