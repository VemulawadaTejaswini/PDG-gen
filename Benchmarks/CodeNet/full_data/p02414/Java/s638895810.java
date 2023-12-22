import java.util.Scanner;

class Main{
    
    public static void main(String[] args){
        
        Scanner sc =new Scanner(System.in);
    
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=sc.nextInt();

        int a[][]=new int[n+1][m+1];
        int b[][]=new int[m+1][l+1];
       
        long sum=0;
     
        for(int i=1;i<=n;i++)
         for(int j=1;j<=m;j++)
          a[i][j]=sc.nextInt();
        
        for(int i=1;i<=m;i++)
         for(int j=1;j<=l;j++)
          b[i][j]=sc.nextInt();
        
        for(int i=1;i<=n;i++) {
         for(int j=1;j<=l-1;j++) {
          for(int k=1;k<=m;k++)
          sum+=a[i][k]*b[k][j];
         System.out.print(sum+" ");
         sum=0;
         }
         for(int k=1;k<=m;k++)
          sum+=a[i][k]*b[k][l];
         System.out.print(sum);
         sum=0;
         System.out.print("\n");
        }
  }
  
}
