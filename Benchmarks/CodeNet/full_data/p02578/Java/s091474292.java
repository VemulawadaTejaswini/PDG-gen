import java.util.*;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long sum = 0l;
    long high = sc.nextLong();
    for(int i = 1; i < n; i++){
      long next = sc.nextLong();
      if(high > next){
      	sum += (high - next);
      } else {
        high = next;
      }
    }
    
    System.out.println(sum);
  }
}
