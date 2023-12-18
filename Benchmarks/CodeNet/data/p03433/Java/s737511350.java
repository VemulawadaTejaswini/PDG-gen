import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();
    int miniCoin = sc.nextInt(); //1円
    int result = target%500;
    
    if(result < miniCoin){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
    }
}
