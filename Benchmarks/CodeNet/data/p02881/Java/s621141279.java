import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    s.close();
    
    int l = 1, r = n;
    int maxL = 1, minR = n;
    while (l <= r) {
    	int p = l * r;
      	if (p == n) {
          maxL = l;
          minR = r;
          continue;
        }
      	if (p < n) {
        	l++;
        } else {
        	r--;
        }
    }
    System.out.printf("%d", maxL + minR - 2);
  }
}
