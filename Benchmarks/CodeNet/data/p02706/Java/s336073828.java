import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	private static List<Long> getStrings(Scanner sc, long num) {
		List<Long> stringList = new ArrayList<>();
		while(num>0) {
			long nextInt = sc.nextLong();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long m = sc.nextInt();
		List<Long> array = getStrings(sc, m);
		long sum = array.stream().mapToLong(t -> t.longValue()).sum();
		if (n>=sum) {
			System.out.println(n-sum);
		} else {
			System.out.println(-1);
		}
	}

}
