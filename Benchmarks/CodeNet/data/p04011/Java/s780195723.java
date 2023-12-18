import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    int sum = 0;
    
    if((n-k) >= 0){
      sum += (k*x)+((n-k)*y);
    }else{
      sum += n*x
    }
    System.out.println(sum);
  }
}