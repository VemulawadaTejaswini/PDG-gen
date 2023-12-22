import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<Integer> list = new ArrayList<Integer>();
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = a + b;
			String d = String.valueOf(c);
			int len = d.length();
			list.add(len);
		}

		for(int n : list){
			System.out.printf("%d\n", n);
		}
	}
}