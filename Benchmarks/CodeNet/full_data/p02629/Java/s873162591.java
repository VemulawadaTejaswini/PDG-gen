import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 何匹目の犬であるか
    Long n = sc.nextLong();
    List<String> anStrings = new ArrayList<>();
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
    int cnt = 0;
    while(true) {
        if(n>=26) {
            int num = (int) (n % 26);
            anStrings.add(list.get(num));
            n /= 26;
            cnt++;
        }
        else {
            //n = n - cnt;
            int num = (int) (n % 26);
            anStrings.add(list.get(num));
            break;
        }
    }
    for(String a:anStrings) {
        System.out.print(a);
    }
    System.out.println("");
  }
}