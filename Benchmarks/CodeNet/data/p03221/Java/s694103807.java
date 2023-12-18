import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int M = scan.nextInt();
    int P[] = new int[M];
    int Y[] = new int[M];
    ArrayList<Integer> sort ;

    for (int i = 0;i < Y.length ;i++ ) {
      P[i] = scan.nextInt();
      Y[i] = scan.nextInt();
    }


    for (int i = 0;i<P.length ;i++ ) {
      sort = new ArrayList<Integer>();
      for (int j =0;j<Y.length ;j++ ) {
        if (i==P[j]) {
          sort.add(Y[j]);
        }
      }
      Collections.sort(sort);
      for (int j = 0;j <  Y.length;j++ ) {
        if (i == P[j]) {
          Y[j] = sort.indexOf(Y[j]);
        }
      }
    }

    for (int i = 0;i < Y.length ;i ++ ) {
      for (int j = (P[i]+1)/10;j<5 ;j++ ) {
        System.out.print(0);
      }
      System.out.print(P[i]);
      for (int j = (Y[i]+1)/10;j<5 ;j++ ) {
        System.out.print(0);
      }
      System.out.println(Y[i]+1);
    }

  }
}
