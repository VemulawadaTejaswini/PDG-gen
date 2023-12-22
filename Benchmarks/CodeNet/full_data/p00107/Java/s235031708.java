import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<List<String>> result = new ArrayList<List<String>>();
		
		long[] x = new long[3];
		for(int i = 0; i < 3; i++){
			x[i] = stdIn.nextLong();
		}
		while( x[0] != 0 || x[1] != 0 || x[2] != 0 ){
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < 3; i++){
				int max = i;
				for(int j = i+1; j < 3; j++){
					if( x[j] > x[max] ){
						max = j;
					}
				}
				long temp = x[max];
				x[max] = x[i];
				x[i] = temp;
			}
			long r = x[1]*x[1]+x[2]*x[2];
		
			int n = stdIn.nextInt();
			for(int i = 0; i < n; i++){
				long m = stdIn.nextLong();
				if( 4*m*m <= r ){
					list.add("NA");
				} else {
					list.add("OK");
				}
			}
			result.add(list);
			x[0] = stdIn.nextLong();
			x[1] = stdIn.nextLong();
			x[2] = stdIn.nextLong();
		}
		for(List<String> ans : result){
			for(String str : ans){
				System.out.println(str);
			}
		}
	}
}