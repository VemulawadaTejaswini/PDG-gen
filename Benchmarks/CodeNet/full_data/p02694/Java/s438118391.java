import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long originalMoney = 100;
    long goalMoney = sc.nextLong();

    int count = 0;
    boolean flg = true;

    while(flg) {
      originalMoney *= 1.01;
      count++;
      if(originalMoney >= goalMoney) {
        flg = false;
        System.out.println(count);
      }
    }
    sc.close();
  }
}