import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    int ans = 0;
    int d = R-L;
    int l = L%2019;
    if (l+d < 2019) {
      ans = l * (l+1); 
    }
    System.out.println(ans);
  }
}