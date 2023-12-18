import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    List<Integer> arr = new ArrayList<>();
    for(int i = 1; i < n + 1; i++) {
      int m = i;
      int sum = 0;
      while(m > 0) {
        sum += m % 10;
        m /= 10;
      }
      if(sum >= a && sum <= b) {
        arr.add(i);
      }
    }
    int ans = 0;
    for(Integer e : arr) {
      ans += e;
    }
    System.out.println(ans);
  }
}