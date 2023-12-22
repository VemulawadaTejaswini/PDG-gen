import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = Integer.parseInt(sc.next());
		int zero = Integer.parseInt(sc.next());
		int min = Integer.parseInt(sc.next());
		int count = Integer.parseInt(sc.next());
		int time = 0;
		
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		
		if(one+zero>=count) {
			System.out.println(one);
		}else {
			int mins = count -one-zero;
			System.out.println(one-mins);
		}
}
}
