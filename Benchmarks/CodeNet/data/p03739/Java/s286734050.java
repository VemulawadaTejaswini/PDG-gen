import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long ans = 0;
    long now = sc.nextInt();
    for(int i = 1; i < N; i++){
      int A = sc.nextInt();
      if(now > 0 && now+A >= 0){
        ans += now+A+1;
        now = -1;
      }else if(now < 0 && now+A <= 0){
        ans += Math.abs(now+A)+1;
        now = 1;
      }else{
        now = now+A;
      }
    } 
    System.out.println(ans);
  }
}