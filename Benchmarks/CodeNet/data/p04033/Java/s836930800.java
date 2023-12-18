import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int pro = 1;
    for(int i=a; i<=b; i++){
      pro *= i;
    }
    if (pro==0){
      System.out.println("0");
    }else if(pro>0){
      System.out.println("Positive");
    }else if(pro<0){
      System.out.println("Negative");
    }
  }
}