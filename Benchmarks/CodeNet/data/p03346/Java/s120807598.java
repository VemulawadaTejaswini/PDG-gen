import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int j = 1;
    int k = 1;
    int tmp = -1;
    int jk = 0;
    int max = 0;
    boolean finished = false;
    for (int i=0; i<n; i++) {
      tmp = sc.nextInt();
      if (tmp == j) {
        j++;
      }
      if (tmp > max && !finished) {
        if (tmp == n) {
          finished = true;
        }
        if (tmp - max == 1) {
          jk++;
        } else {
          jk = 0;
        }
        max = tmp;
      }
    }
    int ret = (n-j+1 > n-jk-1) ? n-jk-1 : n-j+1;
    System.out.println(ret); 
  }
}
