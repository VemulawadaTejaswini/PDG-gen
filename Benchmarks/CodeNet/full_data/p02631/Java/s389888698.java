import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> xors = new ArrayList<Integer>();
    int n;
    n = scanner.nextInt();
    int x;
    int fin = 0;
    for(int i = 0;i < n; i++){
      x = scanner.nextInt();
      xors.add(x);
      fin = fin ^ x;
    }
    
    for(int i = 0; i< n;i++) {
      System.out.print((fin ^ xors.get(i)) + " ");
    }
  }
}