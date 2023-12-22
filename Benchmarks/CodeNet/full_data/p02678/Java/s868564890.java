import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int N;
	static int M;
	public  static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		List<Integer> list_1=new ArrayList<Integer>();
		for(int a=0;a<2*M;a++) {
			list_1.add(sc.nextInt());
		}
		if(list_1.contains(1)) {
			System.out.println("No");
		}
	}
}