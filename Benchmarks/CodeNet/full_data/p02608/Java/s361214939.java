import java.util.*;
public class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] array = new int [N+1];
    int n = (int)Math.sqrt(N);
    for (int x=1; x<n; x++) {
      for (int y=1; y<n; y++) {
        for (int z=1; z<n; z++) {
          int num = x*x+y*y+z*z+x*y+x*z+y*z;
          if (num <= N)
            array[num] += 1;
        }
      }
    }
    for (int i=1; i<N+1; i++)
      System.out.println(array[i]);
  }
}