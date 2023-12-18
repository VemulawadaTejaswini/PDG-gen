import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    String s = sc.next();
    for (int i = 0;i<q;i++){
      int l = sc.nextInt();
      int r = sc.nextInt();
      int ans = 0;
      for (int j = l;j<r;j++){
        if ("AC".equals(s.substring(j-1,j+1))){
          ans++;
        }
      }
      System.out.println(ans);
    }
    sc.close();
  }
}