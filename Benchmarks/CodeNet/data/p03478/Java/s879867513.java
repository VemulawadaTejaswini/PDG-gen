import java.util.*;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int result = 0;
   
    
    for(int i = 1; i <= n; i++){
      
      int sum = 0;
      int num = i;
      while(num > 0){
        // 10 でわった余りを足す
        sum += num % 10;
        // 再帰的に足すため 10 で割った値を再代入
        num /= 10;
      }
      
      if(sum >= a && sum <= b){
        result += i;
      }
      
    }
    
    System.out.println(result);

  }

}