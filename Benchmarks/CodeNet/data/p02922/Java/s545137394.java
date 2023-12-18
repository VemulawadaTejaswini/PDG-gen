import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int tap = sc.nextInt();
      int over = sc.nextInt();
      boolean flg = true;

      int count = 1;
          while (flg) {
        if (tap >= over) {
          flg = false;
        } else {
          tap -= 1;
          tap += tap;
          count++;
        }
      }

      System.out.println(count);
    }
}