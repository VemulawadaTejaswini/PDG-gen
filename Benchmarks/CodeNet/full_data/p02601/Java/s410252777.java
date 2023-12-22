import java.util.*;

class Main {
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
      	int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int K = sc.nextInt();
      	int judge = 0;
      	int alpha = 0, beta = 0, gamma = 0;
      	for (int c = 0; c < K + 1; c++) {
        	for (int b = (int)Math.max(0, 1-c); b < K + 1 - c; b++) {
            	for (int a = (int)Math.max(0, 1-c-b); a < K + 1 - c - b; a++) {
                	alpha = A * (int) Math.pow(2, a);
                  	beta = B * (int) Math.pow(2, b);
                  	gamma = C * (int) Math.pow(2, c);
                  	if ((gamma > beta)&&(beta > alpha)) {
                    	judge = 1;
                      	break;
                    }
                }
            }
        }
      	if (judge == 1) {
          	System.out.println("Yes");
        } else {System.out.println("No");}
      	
	}
}