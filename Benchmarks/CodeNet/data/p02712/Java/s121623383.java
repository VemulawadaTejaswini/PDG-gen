import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    long sum = 0;
    
    for(int i = 1; i <= N; i++){
      if(i%3 == 0)
        continue;
      if(i%5 == 0)
        continue;
      sum += i;
    }
    System.out.println(sum);
  }
}