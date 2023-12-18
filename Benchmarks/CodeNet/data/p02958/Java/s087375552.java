import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] p = new int[n];
    int flg = 0;
    String ans = "No";

    for(int i = 0; i < n; i++){
      p[i] = sc.nextInt();
      if(p[i] != i + 1){
        flg += 1;
      }
    }

    if(flg == 0 || flg == 2){
      ans = "Yes";
    }

    System.out.println(ans);
  }
}
