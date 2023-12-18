import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long pro = 1;
    for(long i=a; i<=b; i++){
      pro *= i;
    }
    if (pro==0){
      System.out.println("Zero");
    }else if(pro>0){
      System.out.println("Positive");
    }else if(pro<0){
      System.out.println("Negative");
    }
  }
}
      
      