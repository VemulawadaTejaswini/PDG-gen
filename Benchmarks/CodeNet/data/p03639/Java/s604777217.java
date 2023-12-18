import java.util.*;
public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int four = 0;
    int odd = 0;
    for(int i = 0 ; i < N; i++){
      int tmp = sc.nextInt();
      if(tmp%4==0){
        four++;
      }else if(tmp%2!=0){
        odd++;
      }
    }
    
    boolean ans = false;
    if(four-odd >= 0){
        ans = true;
    }else{
      if(four+odd == N && four+1 == odd){
        ans = true;
      }
    }
    
    if(ans){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}