
public class Main {

    public static void main(String[] args) {
     try{
         java.util.Scanner s1 = new java.util.Scanner(System.in);
         int n=s1.nextInt();
         int m=s1.nextInt();
         int k=s1.nextInt();
         for(int i=0;i<=n;i++)
         {
             for(int j=0;j<=m;j++)
             {
                 if((i*m+j*n-i*j)==k)
                 {
                     System.out.println("Yes");
                     return;
                 }
             }
         }
         System.out.println("No");
     }
     catch(Exception e)
     {}
   }
}
