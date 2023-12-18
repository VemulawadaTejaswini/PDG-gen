import java.util.*;
public class Main{
    public static void main(String[] args){
          Scanner sc=new Scanner(System.in) ;
            int n=sc.nextInt();
            int a[]=new int[n];
            int i,j;
            for(i=0;i<n;i++){
            a[i]=sc.nextInt();
           }
           int b[]=new int[n];
           int c[]=new int[n];
           for(i=1;i<=n;i++){
           for(j=0;j<i;j++){
           b[j]=a[j];
          }
           for(j=0;j<i;j++){
           c[i]=b[i-j-1];
          }
    }
          for(i=0;i<n;i++){
         System.out.print(c[i]+" ");
        }
    }
}