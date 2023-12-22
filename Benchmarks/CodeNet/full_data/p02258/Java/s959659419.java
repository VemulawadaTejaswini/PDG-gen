import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int numeration = in.nextInt();
		
		//create an array
		int[] values = new int[numeration];
		
		for(int i = 0; i < numeration; i++){
			values[i] = in.nextInt();	
		}
		
		in.close();
		
		int maxp = values[1]-values[0];
		int minv = Math.min(values[1], values[0]);
		for(int i = 2; i < numeration; i ++) {
			maxp = Math.max(maxp, values[i] - minv);
			minv = Math.min(minv, values[i]);
				}
		
		System.out.println(maxp);

	}

}

