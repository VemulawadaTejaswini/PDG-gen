import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> elements = Arrays.asList(sc.nextLine().split(" "));
		
		Main checker = new Main();
		String result = checker.checkEquilateralTriangle(elements);
		
		System.out.println(result);
		sc.close();
	}
	
	public String checkEquilateralTriangle(List<String> elements) {
		long count = elements.stream().distinct().count();
		return count == 1 ? "Yes" : "No";
	}

}