import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int sub500 = (b + c) / 500;
    int sub100 = c / 100;
    int count = 0;
    int divi500 = x / 500;
    if(divi500 > a) {
      divi500 = a;
    }
    for(int i = divi500; i >= divi500 - sub500; i--) {
      int divi100 = (x - 500 * i) / 100;
      if(divi100 > b) {
        divi100 = b;
      }
      for(int j = divi100; j >= divi100 - sub100; j--) {
        count++;
      }
    }
      System.out.println(count);
  }
}