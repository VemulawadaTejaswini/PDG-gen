import java.util.*;

public class Main{

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int stone = 0;

    for(int i = k;stone < x+k-1;i--){
      stone = x - (i-1);
      System.out.println(stone);
    }
  }

}
