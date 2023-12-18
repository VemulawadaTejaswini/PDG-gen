import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=Integer.valueOf(sc.nextLine());
		Optional<Integer> result=Arrays.asList(sc.nextLine().split(" "))
				.parallelStream()
				.map(Main::countCanDivideBy2)
				.min(Integer::compare);
		System.out.println(result.get());
	}
	public static int countCanDivideBy2(String s) {
		int i=Integer.parseInt(s);
		int result=0;
		while(i%2==0) {
			i/=2;
			result++;
		}
		return result;
	}
}