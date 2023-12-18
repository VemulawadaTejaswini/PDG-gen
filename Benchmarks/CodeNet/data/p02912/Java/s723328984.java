import java.util.Scanner;
import java.util.Arrays;
//import java.util.Comparator;

class Main
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      long[] price = new long[n];
      int sum = 0;
      for (int i=0;i<n;i++) {
         price[i] = sc.nextInt();
      }
      Arrays.sort(price);
      
      for (int i=0;i<m;i++) {
        price[n-1] /= 2;
        Arrays.sort(price);
      }
      
      long ans = 0;
      for(int i=0; i<n; i++) {
        System.out.println(price[i]);
        ans += price[i];
      }
      
      System.out.println(ans);
      
    }
}

