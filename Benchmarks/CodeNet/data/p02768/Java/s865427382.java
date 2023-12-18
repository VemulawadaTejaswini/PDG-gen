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
   int Kaijyou1=1;
   int Kaijyou2=nKaijyou;
   for(int i=1;i<=n;i++){
     Kaijyou1*=i;
     Kaijyou2/=(n-i+1);
     if(i!=a && i!=b){
     int totalSub=nKaijyou;
     
     totalSub/=Kaijyou1;
     
     totalSub/=Kaijyou2;
     total+=totalSub;
     total=total%((int)Math.pow(10,9)+7);
     }
   }
   System.out.println(""+total);
 }
}
