import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		int n = stdIn.nextInt(), m = stdIn.nextInt();
		while( n != 0 || m != 0 ){
			List<Integer> list = new ArrayList<Integer>();
			for(int i = n; i <= m; i++){
				if( i%4 == 0 ){
					if( i%100 != 0 || i%400 == 0 ){
						list.add(i);
					}
				}
			}
			result.add(list);
			n = stdIn.nextInt();
			m = stdIn.nextInt();
		}
		for(int i = 0; i < result.size()-1; i++){
			if( result.get(i).size() == 0 ){
				System.out.println("NA");
			} else {
				for(Integer year : result.get(i)){
					System.out.println(year);
				}
			}
			System.out.println();
		}
		if( result.get(result.size()-1).size() == 0 ){
			System.out.println("NA");
		} else {
			for(Integer year : result.get(result.size()-1)){
				System.out.println(year);
			}
		}
	}
}