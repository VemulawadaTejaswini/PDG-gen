import java.util.*;
public class Main{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int a = sc.nextInt();
   int b = sc.nextInt();
   int total = 0;
   int nKaijyou=1;
   for(int i=1;i<=n;i++)nKaijyou*=i;
   for(int i=1;i<=n;i++){
     if(i!=a && i!=b){
     int totalSub=nKaijyou;
     int Kaijyou=1;
     for(int j=1;j<=n-i;j++)Kaijyou*=j;
     totalSub/=Kaijyou;
     Kaijyou=1;
     for(int j=1;j<=i;j++)Kaijyou*=j;
     totalSub/=Kaijyou;
     total+=totalSub;
     total=total%((int)Math.pow(10,9)+7);
     }
   }
   System.out.println(""+total);
 }
}
