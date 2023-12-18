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
        y.add(x[i]);
        i = ++i;
      }
      Collections.sort(y);

      i = 0;
      while(i<n){
        if(x[i] <= y.get((n/2)-1)){
          System.out.println(y.get(n/2));
        }else{
          System.out.println(y.get((n/2)-1));
        }
        i = ++i;
      }
      
    }
    catch (Exception e) {
      System.out.println("NG");
    }
  }
}