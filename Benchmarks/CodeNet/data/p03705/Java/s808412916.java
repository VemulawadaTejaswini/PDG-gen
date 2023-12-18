import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int MIN = sc.nextInt();
		final int MAX = sc.nextInt();
		List<Integer> result = new ArrayList<Integer>();
		
		if( MAX < MIN ){
			// NA
		} else if( MAX == MIN ){
			result.add(MAX+MIN);
		}else {
			search(N-2, 0, MIN, MAX, result);
		}
		
		
		
		//////////////////////////////////////////
		System.out.println(result.size());
		
	}
	
	private static void search(final int currentN, final int sum, final int MIN, final int MAX, List<Integer> result ){
		if( currentN == 0 ){
			if( !result.contains(sum)){
//				System.out.println(sum);
				result.add(sum);
			}
			return;
		}
		for( int i = MIN ; i <= MAX; i++){
			search(currentN-1, sum+i, MIN, MAX, result);
		}
	}
	

}
