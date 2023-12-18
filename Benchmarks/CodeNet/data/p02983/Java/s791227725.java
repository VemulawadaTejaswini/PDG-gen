import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    int R = sc.nextInt();
    int ans = 0;
    int d = R-L;
    int l = L%2019;
    //System.out.println(R%2019);
    //System.out.println("d: " + d + " l: " + l);
    if (l+d < 2018) {
      ans = (l * (l+1))%2019; 
    }
    System.out.println(ans);
  }
}