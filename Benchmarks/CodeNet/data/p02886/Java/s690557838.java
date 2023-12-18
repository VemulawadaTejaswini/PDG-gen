import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int a[]=new int[n];
      long sum=0;
      for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      for(int i=0;i<n-1;i++)
      for(int j=i+1;j<n;j++)
      sum+=(a[i]*a[j]);
      System.out.println(sum);
    }
}