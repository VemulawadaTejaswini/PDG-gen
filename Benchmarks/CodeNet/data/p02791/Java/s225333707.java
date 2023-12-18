import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] p = new int[n];
    int ans = 0;

    for(int i = 0; i < n; i++){
      p[i] = sc.nextInt();
    }

    for(int i = 0; i < n; i++){
      ans += 1;
      for(int j = 0; j <= i; j++){
        if(p[i] > p[j]){
          ans -= 1;
          break;
        } 
      }
    }

    System.out.println(ans);
  }
}
