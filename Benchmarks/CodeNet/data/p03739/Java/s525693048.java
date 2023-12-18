import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    long now = sc.nextInt();
    long ans = now == 0 ? 1 : 0;
    
    for(int i = 1; i < N; i++){
      int A = sc.nextInt();
      if(now > 0){
        if(now + A >= 0){
          ans += now+A+1;
          now = -1;
        }else{
          now = now+A;
        }
      }else if(now < 0){
        if(now + A <= 0){
          ans += Math.abs(now+A)+1;
          now = 1;
        }else{
          now = now+A;
        }
      }else{
        if(A < 0){
          ans++;
          now++;
        }else if(A > 0){
          ans++;
          now--;
        }else{
          ans+=2;
        }
      }
    } 
    System.out.println(ans);
  }
}