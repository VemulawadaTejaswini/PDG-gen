import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		Integer[] per = {a + b, a - b, a * b};

		Arrays.sort(per, Collections.reverseOrder());

		System.out.println(per[0]);
	}
}
