import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Integer[] num=new Integer[new Scanner(System.in).nextInt()];
		for(int i=1;i<=num.length;i++) {
			num[i-1]=i;
		}
		Optional<Integer> maxdivision=Arrays.asList(num)
				.stream()
				.map(Main::countCanDivideBy2)
				.max(Integer::compare);
		int result=(int) Math.pow(2d,maxdivision.get().doubleValue());
		System.out.println(result);
	}
	public static int countCanDivideBy2(Integer i) {
		int result=0;
		for(;i%2==0&&i>0;result++) {
			i/=2;
		}
		return result;
	}
}