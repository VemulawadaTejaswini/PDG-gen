import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int[] moti = new int[n];
	      int dani = 0;
	      for(int i=0; i<n; i++) {
	  		moti[i] = sc.nextInt();
	  	}
	      Arrays.sort(moti);
	      for(int i=0; i<n; i++) {
	    	  if(i!=0 && moti[i] == moti[i-1]) {
	    		  continue;
	    	  }
	    	  else {
	    		  dani++;
	    	  }
	      }
	      System.out.println(dani);
	}
}