import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    List<Integer> chkList = new ArrayList<>();
    for (int i = 0; i < cnt; i++) {
        Integer num = Integer.valueOf(sc.nextInt());
        if (chkList.contains(num)) {
            System.out.println("NO");
            return;
        }
        chkList.add(num);
    }
    System.out.println("YES");
  }
}