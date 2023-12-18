import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<String> array = new ArrayList<String>();
		for(int i = 0;i < n;i++) {
			String temp = sc.next();

			if(!array.contains(temp)) {
				array.add(temp);
			}

		}

		System.out.println(array.size());
	}
}