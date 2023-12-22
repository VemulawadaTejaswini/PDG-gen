import java.util.Scanner;
 import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();int p=1;
      for(int i=1;i<=n;i++)
      {
        p=p*sc.nextInt();
      }
     if(Math.max(p,Math.pow(10,18))!=p)
     {
       System.out.println("-1");
     }
      elseSystem.out.println(p);
    }
}
        
  