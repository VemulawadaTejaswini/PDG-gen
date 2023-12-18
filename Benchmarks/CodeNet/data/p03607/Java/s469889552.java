import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int tmp = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			tmp = sc.nextInt();
			if(al.contains(tmp)) {
				al.remove(al.indexOf(tmp));
			}else {
				al.add(tmp);
			}
		}
		System.out.println(al.size());
	}
}