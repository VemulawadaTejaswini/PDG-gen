import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import java.lang.Math;

public class Main
{
  public static void main(String[] args) throws FileNotFoundException
  {
      Scanner scanner = new Scanner(System.in);//new File("input.txt"));
      int n = scanner.nextInt();
      long ans = 0;
      int[][] fr = new int[11][11];
      for(int i = 1 ; i <= n ; i++){
        int x = i;
        while(x >= 10) x /= 10;
        ++fr[i % 10][x];
      }
      for(int i = 1 ; i <= n ; i++){
        int x = i;
        while(x >= 10) x /= 10;
        ans += fr[x][i % 10];
      }
      System.out.println(ans);
  }
}
