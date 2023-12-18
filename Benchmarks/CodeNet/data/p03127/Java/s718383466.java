import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> nList = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      nList.add(a);
    }
    
    while (nList.size() != 1) {
      Random r = new Random();
      int ran = r.nextInt(n);
      int target = r.nextInt(n);
      nList.set(target, nList.get(target) - nList.get(ran));
      if (nList.get(target) <= 0) {
        nList.remove(target);
        n--;
      }
    }  
    System.out.println(nList.get(0));
  }
}