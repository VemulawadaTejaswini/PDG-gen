import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	static private int result = 0;
	static private List<Integer> resultPattern = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int MIN = sc.nextInt();
		final int MAX = sc.nextInt();
		if( MAX < MIN ){
			// NA
		} else if( MAX == MIN ){
			result = 1;
		}else {
			
			search(N-2, 0, MIN, MAX);
		}
		
		
		
		//////////////////////////////////////////
		System.out.println(result);
		
	}
	
	private static void search(final int currentN, int sum, int currentPos, final int MAX ){
		if( currentN == 0 ){
			System.out.println(sum);
			if( !resultPattern.contains(sum)){
				resultPattern.add(sum);
				result++;
			}
			return;

		} else if( 0<currentN && MAX == currentPos ){
			int localSum = sum+currentPos*currentN;
			if( !resultPattern.contains(localSum)){
				resultPattern.add(localSum);
				result++;
			}
			return;

		}
		
		for( int i = 0 ; i<=currentN; i++){
//			System.out.format("%d,%d\n",i,currentPos);
			search(currentN-i, sum + currentPos*i, currentPos+1, MAX);
		}
	}
	

}
