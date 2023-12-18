import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int ans = 0;
    boolean odd = false;
    for(int i = 0; i < N; i++){
      int a = Integer.parseInt(sc.nextLine());
      
      if(a % 2 == 0){
        ans += (a / 2);
        odd = false;
      }else{
        if(odd){
          ans += ((a+1) / 2);
          odd = false;
        }else{
          ans += (a / 2);
          odd = true;
        }
      }
    }
    System.out.println(ans);
  }
}
