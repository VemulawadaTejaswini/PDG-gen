import java.util.Scanner;
public class Main{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int N=sc.nextInt();
   int x[]=new int [N];
   int y[]=new int [N];
   int t[]=new int [N];
int xs=0,ys=0,d=0;
   for (int i=0;i<N;i++)
   {
if(i==0)
       t[i]=sc.nextInt();
else

      t[i]=sc.nextInt()-t[i-1];
       x[i]=sc.nextInt();
       y[i]=sc.nextInt();
       
   }
   for (int i=0;i<N;i++)
   {
       if((t[i]-(x[i]-xs+y[i]-ys))%2==0&&(t[i]-(x[i]-xs+y[i]-ys))>=0)
           d=1;
       if(d==0)
           break;
       if(i<(N-1))
       {
           xs=x[i];
           ys=y[i];
           d=0;
       }


   }
if(d==1)
    System.out.println("Yes");
else
    System.out.println("No");



   sc.close();
 }
}
