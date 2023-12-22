import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[5];
    int m=0;
    for(int i=0;i<5;i++)
    {
       a[i]=sc.nextInt();
      if(a[i]==0)
         m=i+1;
    }
    System.out.println(m);
  }
}