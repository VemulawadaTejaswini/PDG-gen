import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
        int M = input.nextInt();
      	int[] a = new int[M];
      	int[] b = new int[M];
      	int current =  N * (N - 1) / 2;
      	String ans = "" + current;
      	String already = "";
      	for (int i = 0; i < M; i++) {
        	a[i] = input.nextInt();
          	b[i] = input.nextInt();
        }
      	for (int i = M - 1; i > 0; i--) {
          	boolean aF = already.indexOf(""+a[i]) > -1;
          	boolean bF = already.indexOf(""+b[i]) > -1;
          	if (!aF && bF) {
              current -= already.length();
              already += a[i];
            } else if (aF && !bF) {
              current -= already.length();
              	already += b[i];
            } else if (!aF && !bF) {
              current-= 1;
              already += a[i];
              already += b[i];
            } else if (aF && bF && already.length() == (M - i) * 2) {
              	current -= already.length() - 2;
            } else {
            	current = 0;
            }
          	
            ans = current + "\n" + ans;	
        }
      	
      
 
      
      System.out.print(ans);

    }
}
