import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int d = sc.nextInt();
    int cnt = 0;
    for(int i = 1;i <= m;i++){
      for(int j = 22;j <= d;j++)if((d/10)*(d%10)==m)cnt++;
    }
    System.out.println(cnt);
  }
}