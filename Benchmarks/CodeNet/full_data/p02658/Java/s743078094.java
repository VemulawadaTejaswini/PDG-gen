
import java.util.Scanner;
 import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();long p=1;
      for(int i=1;i<=n;i++)
      {
        p=p*sc.next Long();
      }
     if(Math.max(p,Math.pow(10,18))!=p)
     {
       System.out.println("-1");
     }
      else
        System.out.println(p);
    }
}