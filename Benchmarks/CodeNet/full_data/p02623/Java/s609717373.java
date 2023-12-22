import java.util.*;
public class Main{
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     long k = sc.nextLong();
     long[] a = new long[n];
     long[] b = new long[m];
     int i,j,ans=0,ans1 = -1,readb=0;
     long time=0;
     a[0] = sc.nextLong();
     for(i=1;i<n;i++){
       a[i] = a[i-1]+sc.nextLong();
     }
     b[0] = sc.nextLong();
     for(i=1;i<m;i++){
       b[i] = b[i-1]+sc.nextLong();
     }
     // aから読まないとき
     for(i=0;i<m;i++){
       if(k<b[i]){
         ans1 = i;
         break;
       }
     }
     if(ans1 ==-1){
       ans1 = m;
     }
     
     for(i=0;i<n;i++){
       time = a[i];
       if(k<time){
         break;
       }
       for(j=0;j<m;j++){
         if(k-time>=b[m-1]){
           readb = m;
           break;
         }
         if(k-time<b[i]){
           readb = i;
           break;
         }
       }
       ans = Math.max(ans,i+readb+1);
     }
     System.out.println(Math.max(ans1,ans));

   }
}
