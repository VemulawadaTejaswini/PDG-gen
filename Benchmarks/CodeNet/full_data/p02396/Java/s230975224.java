import java.util.*;

public class Main{
	public static void main(String[] args){
		List<Integer> numbers = new ArrayList<Integer>();
		Scanner aScanner = new Scanner(System.in);
		while(aScanner.nextInt() == 0){
			int n = aScanner.nextInt();
			numbers.add(n);
		}

		for(int i = 0; i < numbers.size(); i++){
			System.out.println("Case " + i + ": " + numbers.get(i));
		}
	}
}