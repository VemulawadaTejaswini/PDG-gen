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
        i = ++i;
      }

      i = 0;
      while(i<n){
        for(j=0; j<n; j++){
          y.set(j, x[j]);
        }
        y.remove(i);
        Collections.sort(y);
        System.out.println(y.get((n/2)-1));
        y.add(0);
        i = ++i;
      }
      
    }
    catch (Exception e) {
    
    }
  }
}