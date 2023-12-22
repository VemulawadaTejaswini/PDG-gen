import java.util.*;

public class Main{

	public static void main(String[] args) throws java.io.IOException{

		Scanner in = new Scanner(System.in);
		int[] x;
		x = new int[4];
		for(int i = 0; i < 5; i++){
			x[i] = in.nextInt();
		}
		if( 0 < x[2] && x[2] < x[0] - x[4] && 0< x[3] && x[3] < x[1] - x[4]){
			System.out.println("Yes");
		} else{
			System.out.println("No");
		}
	}
}