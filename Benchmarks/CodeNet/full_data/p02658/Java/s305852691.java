import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int sum = 1;
    for (int i=0;i<a;i++){
      int b = scan.nextInt();
      sum*=b;
    }
    if (sum>math.pow(18)){
      System.out.println("-1");
      return;
    }
    System.out.println(sum);
  }
}
