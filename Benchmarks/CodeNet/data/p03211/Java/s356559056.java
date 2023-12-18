import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    final int LIKE_NUM = 753;
    int min = Integer.MAX_VALUE;
    int ans = 0;
    for(int i=0; i<S.length()-3; i++){
      int tmp = Integer.parseInt(S.substring(i, i+3));
      tmp = Math.abs(tmp - LIKE_NUM);
      ans = Math.min(min, tmp);
    }
    System.out.print(ans);
  }
}
