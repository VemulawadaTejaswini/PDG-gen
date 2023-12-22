import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] x = new int[5];
    int ans = 1;
    for (int i = 0; i < 5; i++){
      x[i] = sc.nextInt();
      if (x[i] == 0) ans += i;
    }
    System.out.println(ans);
  }
}