import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int money1 = sc.nextInt();
          int money2 = sc.nextInt();
          int pro = sc.nextInt();
          if(pro - money1 + money2 >= 0) {
            System.out.println("Yes");
          } else {
            System.out.println("No");
          }      
          }
  }