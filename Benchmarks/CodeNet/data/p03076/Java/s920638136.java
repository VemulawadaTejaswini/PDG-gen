import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int ans = 0;
    
    for(int i=0;i<5;i++){
      int i = sc.nextInt();
      if(i%10 == 0){
        ans += i;
      }else{
        while(i%10 != 0){
          i++;
        }
        if(i%10 == 0){
        ans += i;
      }
      }
    }
    System.out.println(ans);
  }
}
    