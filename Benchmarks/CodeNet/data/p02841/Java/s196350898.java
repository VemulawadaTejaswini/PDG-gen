import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month1 = sc.nextInt();
    int day1 = sc.nextInt();
    int month2 = sc.nextInt();
    int day2 = sc.nextInt();

    if(month1 != month2)
      System.out.println(1);
    else
      System.out.println(0);
  }
}