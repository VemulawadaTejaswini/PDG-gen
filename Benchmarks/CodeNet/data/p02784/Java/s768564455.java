import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<>();
    
    for (int i = 0; i < N; i++) {
    A.add(sc.nextInt());
    }
    
    Collections.sort(A, Comparator.reverseOrder());
    
    for (int i = 0; i < N; i++) {
    H -= A.get(i);
    }
    
    if (H <= 0) {
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
    
  }
}