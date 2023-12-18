import java.util.Scanner;
import java.util.ArrayList;
 
class Main {
	public static void main(String[] args) {
 
	    Scanner sc = new Scanner(System.in);
	    long A = sc.nextLong();
	    long B = sc.nextLong();
	    long C = sc.nextLong();
	    long K = sc.nextLong();
	    ArrayList<Integer> card = new ArrayList<Integer>(); 
	    
	    for (int a = 0; a < A; a++) { card.add(1);  }
	    for (int b = 0; b < B; b++) { card.add(0);  }
	    for (int c = 0; c < B; c++) { card.add(-1); }
	    
	    long max = 0;
	    for (int i = 0; i < K; i++) {
	      max += card.get(i);
	    }
	    
	    System.out.println(max);
	    
	  }
}