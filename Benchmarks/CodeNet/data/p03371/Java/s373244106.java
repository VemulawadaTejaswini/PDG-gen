import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();

    int ayen = a * x;
    int byen = b * y;
    int total = 0;
    if(a + b > 2 * c){
      total = ayen + byen;
      int sagaku = a + b - 2 * c;
      while(x >= 1 && y >= 1){
        x--;
        y--;
        total -= sagaku;
      }

      int k = total;
      int nokori = 0;
      int noko = 0;
      if(x == 0){
        nokori = y;
        noko = b;
      }else{
        nokori = x;
        noko = a;
      }
      if(noko > 2 * c){
        sagaku = noko - 2 * c;
        while(nokori >= 1){
          nokori--;
          total -= sagaku;
        }
      }

    }
    System.out.println(total);
  }
}
