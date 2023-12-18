import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int k = sc.nextInt();
    boolean p = true;

    int m = Math.abs(a - b);
    int n = Math.abs(a - c);
    int l = Math.abs(a - d);
    int x = Math.abs(a - e);
    int y = Math.abs(b - c);
    int z = Math.abs(b - d);
    int q = Math.abs(b - e);
    int w = Math.abs(c - d);
    int r = Math.abs(c - e);
    int t = Math.abs(d - e);

    int data[] = { m , n , l , x , y , z , q , w , r , t };

    for (int i = 0 ; i < data.length ; i++ ) {

      if ( data[i] <= k ) {
        p = true;
      } else {
        p = false;
        break;
      }
    }

    if (p) {
      System.out.println("Yay!");
    } else {
      System.out.println(":(");
    }

  }
}
