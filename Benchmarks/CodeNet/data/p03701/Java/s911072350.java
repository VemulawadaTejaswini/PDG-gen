import java.util.*;
public class Main {
  public static void main(String[] args) {
    int sum = 0;
    int i = 0;
    int sw = 0;
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int stb[] = new int[N];
    while(sc.hasNextInt()){ 
      int s = sc.nextInt();
      stb[i] = s;
      i++;
      sum = sum + s;
      if (!(numplace(s) == 0)) {      //一の位がゼロ以外
        sw = 1;
      }
    }
    if (sw == 0)  {
      System.out.println(0);
    } else if (numplace(sum) == 0) {
      Arrays.sort(stb);
      for (i = 0; i < N ; i++) {
        //System.out.println(Arrays.toString(stb));
        int num = stb[i];
        if (!(numplace(sum-num) == 0)) {
          sum = sum - num;
          break;
        }
      }
      System.out.println(sum);
    }
  }
  private static int numplace(int numchk) {
     return numchk % 10;
  }
}