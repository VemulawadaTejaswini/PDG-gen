import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		String[] info=sc.nextLine().split(" ");
		Double t=Double.valueOf(info[0])*1000;
		Double a=Double.valueOf(info[1])*1000;

		List<Double> input=Arrays.asList(sc.nextLine().split(" "))
				.stream()
				.map(s->Double.valueOf(s))
				.map(s->Math.abs(a-(t-s*6)))
				.collect(Collectors.toList());
		System.out.println(input);
		System.out.println(input.indexOf(Collections.min(input))+1);
	}
}