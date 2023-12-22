import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		int N = scan.nextInt();
		boolean flag = false;
		for(int i = 0; i < N; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(a * a == b * b + c * c | b * b == a * a + c * c | c * c == a * a + b * b){
				flag = true;
			}
			list.add(flag? "YES" : "NO");
		}

		for(String s : list){
			System.out.println(s);
		}
	}
}