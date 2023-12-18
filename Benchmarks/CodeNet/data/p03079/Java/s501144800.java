import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exawizards2019_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> elements = Arrays.asList(sc.nextLine().split(" "));
		
		Exawizards2019_1 checker = new Exawizards2019_1();
		String result = checker.checkEquilateralTriangle(elements);
		
		System.out.println(result);
		sc.close();
	}
	
	public String checkEquilateralTriangle(List<String> elements) {
		long count = elements.stream().distinct().count();
		return count == 1 ? "Yes" : "No";
	}

}