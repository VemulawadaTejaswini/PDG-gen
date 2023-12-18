import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections; 
 
public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Set<Integer> Aset = new HashSet<Integer>();
    for (int i =0; i<N; i++) {
      int a = sc.nextInt();
      if (Aset.contains(a)) {
        Aset.remove(a);
      } else {
        Aset.add(a);
      }
    }
    System.out.println(Aset.size());  
  }
}