import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int N = Integer.parseInt(sc.next());
      	int[] A = new int[N];
      	int[] delta = new int[N + 1];//up or down from yesterday
      	delta [0] = 0;
      	delta [N] = 0;//最終日には株を0にしたい
      	for (int i=0; i<N; i++) {
          	A[i] = Integer.parseInt(sc.next());
          	if (i > 0) {
            	if (A[i] >= A[i - 1]) {
                	delta[i] = 1;
                } else {delta[i] = 0;}
            }
        }
      
      	int keep = 0;
      	int money = 1000;
      	for (int i = 0; i < N; i++) {
        	if ((delta[i]==0) && (delta[i+1]==1)) {
            	keep += money / A[i];
              	money %= A[i];
            } else if ((delta[i]==1) && (delta[i+1]==0)) {
            	money += keep * A[i];
              	keep = 0;
            }
        }
      
      	System.out.println(money);
      
	}
}