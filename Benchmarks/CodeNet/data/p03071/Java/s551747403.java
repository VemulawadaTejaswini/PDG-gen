import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = 0;
		if(a > b) {
			result = 2*a - 1;
		} else if(a == b) {
			result = a*2;
		}else {
			result = 2*b - 1;
		}
		System.out.println(result);
	}
}