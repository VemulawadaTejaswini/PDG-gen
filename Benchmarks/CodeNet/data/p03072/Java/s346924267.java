import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    int k = 0;
    while(sc.hasNext()) {
      h[k] = sc.nextInt();
      k++;
    }
    
    int cnt = 0;
    boolean isGood = true;
    for(int i = 0; i < h.length; i++) {
	  for (int j = 0; j < i; j++) {
		if (h[j] > h[i]) {
		  isGood = false;
        }
      }
      if (isGood) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}