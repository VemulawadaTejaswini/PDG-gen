import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      long N = sc.nextLong();
	      long C = sc.nextLong();
	      long [] x = new long[(int) (N + 2)];
	      long [] v = new long[(int) (N + 2)];
	      for(int i = 1; i <= N; i++) {
	    	    x[i] = sc.nextLong();
	    	    v[i] = sc.nextLong();
		  }
	      sc.close();
	      
	      x[0] = 0;
	      v[0] = 0;
	      x[(int) (N + 1)] = C;
	      v[(int) (N + 1)] = 0;
	      long energy = 0;
	      
	      for(int a = 0; a <= N; a++) {
	    	    for(int b = a + 1; b <= N + 1; b++) {
	    	    	  long tmpEnergy = 0;
	    	    	  for(int i = 0; i <= a; i++) {
	    	    		  tmpEnergy += v[i];
	    		  }
	    	    	  for(int i = b; i <= N + 1; i++) {
	    	    		  tmpEnergy += v[i];
	    		  }
	    	    	  tmpEnergy -= (2 * Math.min(x[a], C - x[b]) + Math.max(x[a], C - x[b]));
	    	    	  if(tmpEnergy > energy) {
	    	    		  energy = tmpEnergy;
	    	    	  }
			}	
		  }
	      
	      System.out.println(energy);
	      System.exit(0);
	    }
}