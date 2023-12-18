import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    List<String> lunlunList = new ArrayList<>();

    for (int i = 1; i <= 9; i++) {
      if (--k == 0) {
        System.out.println(String.valueOf(i));
        return;
      }
      lunlunList.add(String.valueOf(i));
    }

    while (true) {
      List<String> tmp;
      tmp = genLunlun(lunlunList.remove(0));
      while (!tmp.isEmpty()) {
        String s = tmp.remove(0);
        if (--k == 0) {
          System.out.println(s);
          return;
        } else {
          lunlunList.add(s);
        }
      }
    }
  }

  public static List<String> genLunlun(String s) {
    List <String> lunlunList = new ArrayList<>();
    switch (s.substring(s.length() - 1)) {
      case "0" :
        lunlunList.add(s.concat("0"));
        lunlunList.add(s.concat("1"));
        break;
      case "1" :
        lunlunList.add(s.concat("0"));
        lunlunList.add(s.concat("1"));
        lunlunList.add(s.concat("2"));
        break;
      case "2" :
        lunlunList.add(s.concat("1"));
        lunlunList.add(s.concat("2"));
        lunlunList.add(s.concat("3"));
        break;
      case "3" :
        lunlunList.add(s.concat("2"));
        lunlunList.add(s.concat("3"));
        lunlunList.add(s.concat("4"));
        break;
      case "4" :
        lunlunList.add(s.concat("3"));
        lunlunList.add(s.concat("4"));
        lunlunList.add(s.concat("5"));
        break;
      case "5" :
        lunlunList.add(s.concat("4"));
        lunlunList.add(s.concat("5"));
        lunlunList.add(s.concat("6"));
        break;
      case "6" :
        lunlunList.add(s.concat("5"));
        lunlunList.add(s.concat("6"));
        lunlunList.add(s.concat("7"));
        break;
      case "7" :
        lunlunList.add(s.concat("6"));
        lunlunList.add(s.concat("7"));
        lunlunList.add(s.concat("8"));
        break;
      case "8" :
        lunlunList.add(s.concat("7"));
        lunlunList.add(s.concat("8"));
        lunlunList.add(s.concat("9"));
        break;
      case "9" :
        lunlunList.add(s.concat("8"));
        lunlunList.add(s.concat("9"));
    }
    return lunlunList;
  }
}
