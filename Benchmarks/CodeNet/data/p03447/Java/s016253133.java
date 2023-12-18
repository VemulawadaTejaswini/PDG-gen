import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int wallet = sc.nextInt();
    int cake   = sc.nextInt();
    int donut  = sc.nextInt();
    int result = wallet-cake;

    while(donut <= result){
      result -= donut;    
}
    System.out.println(result);
    }
}