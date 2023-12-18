import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		 Scanner scan = new Scanner(System.in);
	     String str = scan.nextLine();
	     String[] chars = str.split(" ");
	     int N = Integer.valueOf(chars[0]);
	     int K = Integer.valueOf(chars[1]);
	     int Q = Integer.valueOf(chars[2]);
	     int[] scores = new int[N];
	     for(int i=0;i<N;i++) {
	    	 scores[i] = 0;
	     }
	     for(int i=0;i<Q;i++) {
	    	 str = scan.nextLine();
	    	 scores[Integer.valueOf(str)-1]++;
	     }
	     for(int s:scores) {
	    	 if(K-Q+s>0) {
	    		 System.out.println("Yes");
	    	 }
	    	 else {
	    		 System.out.println("No");
	    	 }
	     }
	}

}
