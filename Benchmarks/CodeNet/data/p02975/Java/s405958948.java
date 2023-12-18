import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number, temp, i, j;
    temp = 0;
    number = Integer.parseInt(sc.next());
    int[] num = new int[number];
    for(i = 0; i < number; i++) num[i] = Integer.parseInt(sc.next());
    for(i = 0; i < number; i++) temp ^= num[i];
    if(temp == 0) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
