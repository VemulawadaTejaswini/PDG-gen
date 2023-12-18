import java.util.*;

public class Main{
  public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
    String topping = sc.nextLine();
    int result = 700 + 100 * (topping.replace("x" , "").length());
    System.out.println(result);
  }
}