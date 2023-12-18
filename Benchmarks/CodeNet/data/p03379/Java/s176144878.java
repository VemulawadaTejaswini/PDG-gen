import java.util.*;

public class Main{
  public static void main(String[] args) {
    try {
      Scanner scan = new Scanner(System.in);
      int n, i=0, j;
      n = Integer.parseInt(scan.next());
      int x[] = new int[n];
      ArrayList<Integer> y = new ArrayList<Integer>();
      
      while(i<n){
        x[i] = Integer.parseInt(scan.next());
        i = ++i;
      }

      i = 0;
      while(i<n){
        y.add(0);
        y.set(i, x[i]);
        i = ++i;
      }

      i = 0;
      while(i<n){
        y.remove(y.indexOf(x[i]));
        Collections.sort(y);
        System.out.println(y.get((n/2)-1));
        y.add(x[i]);
        i = ++i;
      }
      
    }
    catch (Exception e) {
      System.out.println("NG");
    }
  }
}