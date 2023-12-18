import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    long A = sc.nextLong();
	    long B = sc.nextLong();
	    long C = sc.nextLong();
	    long K = sc.nextLong();
	    long max = 0;
	    
	    if (K > 0 && K >= A) {
	      max += (A * 1);
	      K -= A;
	    } else if (K > 0 && K < A) {
	      max += (K * 1);
	      K = 0;
	    }
	    
	    if (K > 0 && K >= B) {
	      K -= B;
	    } else if (K > 0 && K < B) {
	      K = 0;
	    }
	    
	    if(K > 0 && K >= C) {
	      max += (C * -1);
	      K -= C;
	    } else if (K > 0 && K < C) {
	      max += (K * -1);
	      K = 0;
	    }
	    
	    System.out.println(max);
	    
	  }
}