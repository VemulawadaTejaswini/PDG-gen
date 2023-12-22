
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Long n = sc.nextLong();

    List<String> list = new ArrayList<>();
    list.add("z");
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    list.add("e");
    list.add("f");
    list.add("g");
    list.add("h");
    list.add("i");
    list.add("j");
    list.add("k");
    list.add("l");
    list.add("m");
    list.add("n");
    list.add("o");
    list.add("p");
    list.add("q");
    list.add("r");
    list.add("s");
    list.add("t");
    list.add("u");
    list.add("v");
    list.add("w");
    list.add("x");
    list.add("y");

    List<String> ansList = new ArrayList<String>();

    int cnt = 0;
    boolean flg = false;
      while(n != 0) {
        long y = n % 26;
        if(y == 0) {
          ansList.add(list.get((int) y ));
          flg = true;
        }else {
          if(flg) {
            ansList.add(list.get((int) y - 1));
          }else {
            ansList.add(list.get((int) y));
          }
        }
        n = n / 26;
        if(n == 1 && flg) {
          n = 0L;
        }
        cnt++;
      }
    String[] ansArray = new String[cnt];
    for(int i = 0;i < cnt ; i++) {
      ansArray[i] = ansList.get(cnt - 1 - i);
    }

    String ans = String.join("", ansArray);

    System.out.println(ans);
  }
}
