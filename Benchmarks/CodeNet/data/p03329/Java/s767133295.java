import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    sc.close();
	    
	    int count = 0;
	    
	    while(N >= 6) {
		    int i = 1;
		    while(Math.pow(9, i) <= N) {
		    	i++;
		    }
		    int tmp9 = (int) Math.pow(9, i - 1);
		    
		    int j = 1;
		    while(Math.pow(6, j) <= N) {
		    	j++;
		    }
		    int tmp6 = (int) Math.pow(6, j - 1);
		    
		    N -= Math.max(tmp9, tmp6);
		    count++;
	    }
	    
	    count += N;
	    
	    System.out.println(count);
	    System.exit(0);
	}
}