import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int pro1 = sc.nextInt();
          int pro2 = sc.nextInt();
          int money = sc.nextInt();
          if(money - pro1 - pro2 >= 0) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }      
          }
  }