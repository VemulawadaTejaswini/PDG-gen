
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();

    // 26の指数
    double x = Math.log(n) / Math.log(26);
    // 指数の整数部分
    int integerPart = (int)x;

    Map<Integer, String> map = new HashMap<>();
    map.put(0,"a");
    map.put(1,"b");
    map.put(2,"c");
    map.put(3,"d");
    map.put(4,"e");
    map.put(5,"f");
    map.put(6,"g");
    map.put(7,"h");
    map.put(8,"i");
    map.put(9,"j");
    map.put(10,"k");
    map.put(11,"l");
    map.put(12,"m");
    map.put(13,"n");
    map.put(14,"o");
    map.put(15,"p");
    map.put(16,"q");
    map.put(17,"r");
    map.put(18,"s");
    map.put(19,"t");
    map.put(20,"u");
    map.put(21,"v");
    map.put(22,"w");
    map.put(23,"x");
    map.put(24,"y");
    map.put(25,"z");
    List<String> list = new ArrayList<>(map.values());

    String[] ansArray = new String[integerPart + 1];
    for(int i = 0; i < integerPart + 1 ;i++) {
      long y = n % 26;
      ansArray[integerPart - i] = list.get((int) y - 1);
      n = n/26;
    }
    String ans = String.join("", ansArray);

    System.out.println(ans);
  }
}
