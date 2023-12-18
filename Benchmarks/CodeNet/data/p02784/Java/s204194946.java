import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    ArrayList<Integer> A = new ArrayList<>();
    
    for (int i = 0; i < N; i ++) {
    A.add(sc.nextInt());
    }
    Arrays.sort(A, Comparator.reverseOrder()); 
    H -= A.get(0);
    H -= A.get(1);
    
    if (H <= 0) {
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
    
  }
}