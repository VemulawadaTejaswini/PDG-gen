import java.util.Scanner;
 
public class Main {
	  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int x[] = new int[N];
		    int y[] = new int[N];
		    
		    for (int i = 0; i < N; i++) {
		      x[N] = sc.nextInt();
		      y[N] = sc.nextInt();
		    }
        	double sum = 0.0;
 			for(int i = 0; i < N; i++){
      			for(int j = i + 1; j < N; j++){
            	  sum += Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
                }
            }
	        System.out.print(sum * 2/ N);
	  }
}