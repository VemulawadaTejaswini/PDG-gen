import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int ans = 0;
    for(int i = 1; i <= N; i++){
      if((1 <= i && i < 10) || (100 <= i && i < 1000) || (10000 <= i && i < 100000)){
        ans++;
      }
    }
    System.out.println(ans);
  }
}