import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int a[] = new int[n];
    long sum = 0;
    int buf = 0;
    String ans = "No";

    for(int i = 0; i < n; i++){
      a[i] = sc.nextInt();
      sum += a[i];
    }

    for(int i = 0; i < n; i++){
      if(a[i] >= sum / (4 * m)){
        buf += 1;
      }
    }

    if(buf >= m){
      ans = "Yes";
    }

    System.out.println(ans);
  }
}
