import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    int c = 0;
    int d = 0;
    boolean [] a = new boolean[n];
    boolean [] t = new boolean[n];
    for (int i=0;i<m;i++){
      int g = scan.nextInt();
      String check = scan.next();
      if (a[g-1] == true){
        continue;
      }

      if (check.equals("AC") == true){
        c += 1;
        a[g-1] = true;
        if (t[g-1] == true){
          d += 1;
        }
      }
      else{
        t[g-1] = true;
      }
    }

    System.out.print(c+" ");
    System.out.println(d);
  }
}
