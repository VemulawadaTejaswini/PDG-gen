import java.util.*;

public class Main{
	public static void main(String[] args){
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		for(;;){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			numbers.add(n);
		}

		int i = 0;
		for(Integer n : numbers){
			System.out.printf("Case %d: %d\n", ++i, n);
		}
	}
}