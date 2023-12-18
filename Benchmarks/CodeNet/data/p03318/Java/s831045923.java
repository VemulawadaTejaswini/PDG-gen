import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long K = scanner.nextInt();
		Solution(K);

	}
	static void Solution(long K) {
		List<Long> resultList = new ArrayList<>();
		long number = 0;
		while(resultList.size()<K) {
			number++;
			String s = number+"";
			long N=0;
			for(int i=0; i<s.length(); i++) {
				N = N + Integer.parseInt(s.charAt(i)+"");
			}
			if(number/N<=1) {
				System.out.println(number);
				resultList.add(number);
			}
		}
	
	}

}