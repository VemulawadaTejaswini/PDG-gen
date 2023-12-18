import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    double W = sc.nextInt();
    double H = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    sc.close();

    int flg = 0;

    if (x == W /2 && y == H / 2){
      flg = 1;
    }

    System.out.println(W * H / 2 + " " + flg);
    
  }

}