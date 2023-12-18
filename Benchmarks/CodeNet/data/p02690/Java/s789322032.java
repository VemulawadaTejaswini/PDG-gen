import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static void search(long X , List<Long> pow5s){
		for(int i = 0 ; i < pow5s.size() ; ++i){
			for(int j = 0 ; j < pow5s.size() ; ++j){
				long x = pow5s.get(i);
				long y = pow5s.get(j);
				if(x + y == X){
//					System.out.println(x+" "+y);
					long A = i % 2 == 0 ? i / 2 : - (i / 2);
					long B = j % 2 == 0 ? j / 2 : - (j / 2);
					System.out.println(A+" "+(- B));
					return ;
				}
			}
		}		
	}
	public static void main(String[] args) {
		List<Long> pow5s = new ArrayList<Long>();
		for(long a = 0 ; a <= 6000 ; ++a){
			long v = a * a * a * a * a;
			pow5s.add(v);
			pow5s.add(- v);			
		}
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		search(X, pow5s);
	}
}
