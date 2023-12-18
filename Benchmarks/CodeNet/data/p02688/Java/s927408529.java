import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> sunuke = new ArrayList<String>();
    int N = sc.nextInt();
    int K = sc.nextInt();
    int sum = 0;
    for (int i = 0; i < K; i++) {
	  int ninzu = sc.nextInt();
      for  (int h = 0; h < ninzu; h++) {
        int j = sc.nextInt();
        sunuke.set(j-1,"have");
      }
    }
    for (int g = 0; g < N; g++) {
      if (sunuke.get(g).equals("have")) {
        sum = sum;
      } else {
        sum = sum + 1;
      }
    }
    System.out.println(sum);
  }
}