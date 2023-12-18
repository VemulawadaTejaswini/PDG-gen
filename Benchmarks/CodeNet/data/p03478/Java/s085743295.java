import java.util.*;

public class Main {

	public static void main(String[] args) {


		int N = 0;
		int A = 0;
		int B = 0;
		int sum = 0;

		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> sumList = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		N = scanner.nextInt();
		A = scanner.nextInt();
		B = scanner.nextInt();

		for(int i = 1; i <= N ; i++) {
			for(int j = 0; j < String.valueOf(j).length() ; j++	) {
				intList.add(i % 10);
			}
			for(int k : intList) {
				sum += k;
			}
			if(sum >= A && sum <=B) {
				sumList.add(i);
			}
			sum = 0;
			}
		for(int i : sumList) {sum += i;}
		System.out.println(sum);
	}
}
