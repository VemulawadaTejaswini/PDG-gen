import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    boolean flag = false;
    while (flag == false) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      String op = sc.next();
      int b = sc.nextInt();
      sc.nextLine();
      switch (op) {
      case "+":
        ans.add(a+b);
        break;
      case "-":
        ans.add(a-b);
        break;
      case "*":
        ans.add(a*b);
        break;
      case "/":
        ans.add(a/b);
        break;
      case "?":
        flag = true;
        break;
      }
      if (ans.size() != 0) System.out.println(ans.get(0));
      ans.clear();
    }
    /*for (int c : ans){
      System.out.println(c);
    }*/
  }
}

