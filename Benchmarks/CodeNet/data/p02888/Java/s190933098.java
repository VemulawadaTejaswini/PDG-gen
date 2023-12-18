import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int cntr=0;
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      for(int i=0;i<n-2;i++)
      {
          for(int j=i+1;j<n-1;j++)
          {
              for(int k=j+1;k<n;k++)
              if(a[i]<(a[j]+a[k])&&a[j]<(a[i]+a[k])&&a[k]<(a[i]+a[j]))
              cntr++;
          }
      }
      System.out.println(cntr);
    }
}