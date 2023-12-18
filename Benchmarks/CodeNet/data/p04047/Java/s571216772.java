import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> lst = new ArrayList<Integer>();
		for(int i = 1; i <= 2*n ; i++) {
			lst.add(sc.nextInt());
		}
		Collections.sort(lst);
		int sum = 0;
		for(int i=0; i<2*n;i+=2) {
			sum+=lst.get(i);
		}
		System.out.println(sum);
	}

}