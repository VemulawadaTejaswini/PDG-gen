import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt(), b = sc.nextInt();
		ArrayList<Integer> pa = new ArrayList<Integer>();
		ArrayList<Integer> pab = new ArrayList<Integer>();
		ArrayList<Integer> pb = new ArrayList<Integer>();
		for(int i = 0;i < n;i ++) {
			int p = sc.nextInt();
			if(p <= a) pa.add(p);
			else if(a + 1 <= p && p <= b) pab.add(p);
			else pb.add(p);
		}
		int min = pa.size();
		if(pab.size() < min) min = pab.size();
		if(pb.size() < min) min = pb.size();
		System.out.println(min);
	}
}