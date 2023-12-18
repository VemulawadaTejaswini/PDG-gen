import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int ans = 0;
    int count = 0;
    while(count < 2){
      if(n == 4){
        count++;
      }
      
      if(n%2==0){
        n /= 2;
      }else{
        n = n*3+1;
      }
      ans++;
    }
    
    System.out.println(ans);
  }
}