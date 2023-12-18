import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int N = sc.nextInt();
   double k = N/1.08 ;
   int kn = (int)k;
   
   int[] Xi ={kn-6,kn-5,kn-4,kn-3,kn-2,kn-1,kn,kn+1,kn+2,kn+3,kn+4,kn+5,kn+6};
   
   boolean ss = true;
   for(int i=0;i<=12;i++)
   {
    if(Xi[i]*1.08 == N) 
    {
      System.out.println(Xi[i]);
      ss = false;
      break;
    }
   }
   if(ss) System.out.println(":(");
 
   
 }
}