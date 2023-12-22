import java.util.Scanner;
 import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();long a[]=new Long[n];
      for(int i=0;i<n;i++)
      {
     a[i]=sc.nextLong();
        p=p*a[i];
      }
     if(Math.max(p,Math.pow(10,18))!=p)
     {
       System.out.println("-1");
     }
      else
        System.out.println(p);
    }
}