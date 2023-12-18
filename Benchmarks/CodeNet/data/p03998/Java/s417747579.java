import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    ArrayList<String> A = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
    ArrayList<String> B = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
    ArrayList<String> C = new ArrayList<>(Arrays.asList(sc.nextLine().split("")));
    
    String popped = A.remove(0);
    
    while (true) {
      if (popped.equals("a")) {
        if (A.size() == 0) { System.out.println("A"); break; }
        popped = A.remove(0);
      } else if (popped.equals("b")) {
        if (B.size() == 0) { System.out.println("B"); break; }
        popped = B.remove(0);
      } else if (popped.equals("c")) {
        if (C.size() == 0) { System.out.println("C"); break; }
        popped = C.remove(0);
      } 
    }
  }
}
