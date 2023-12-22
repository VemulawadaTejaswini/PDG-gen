import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		while(in.hasNext()) {
			String buf = in.nextLine();
			str.add(buf);
		}
		
		int facter[];
		facter = new int[str.size()];

		for (int i = 0; i < str.size(); i++) {
			facter[i] = Integer.parseInt(str.get(i));
		}
		
		int count = 0;
		
		for (int i = 0; i < facter.length; i++) {
			if (isPrime(facter[i])) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean isPrime (int number) {
		if (number == 2) {
			return true;
		}
		if ((number < 2) || ((number % 2) == 0)) {
			return false;
		}
		
		for (int i = 3; i <= Math.sqrt(number); i = i + 2 ) {
			if ((number % i) == 0) {
				
				return false;
			}
			
		}

		return true;
	}
	
	

}