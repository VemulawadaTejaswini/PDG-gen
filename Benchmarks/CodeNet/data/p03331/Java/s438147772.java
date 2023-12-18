import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		System.out.println(sumValue(n));

	}

	public static int sumValue(int value){
		int sum = 0;
		String s = String.valueOf(value);
		for(int i=0; i< s.length(); i++){
		sum += s.charAt(i) - '0';
		}
		return sum;
	}
}
