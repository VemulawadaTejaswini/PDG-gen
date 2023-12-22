import java.util.Scanner;
class Main
 {
   public static void main(String[] args)
      {
   Scanner S = new Scanner(System.in);
      int x = S.nextInt();
      int y = S.nextInt();
      int z =S.nextInt();
      int m = 0;
      int n = 0;
      for(int i=x;i<=y ;i++)
      if (z%i==n){
      m= m + 1;
      }
      System.out.println(m);
      }
 }

