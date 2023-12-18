import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		int num = scan.nextInt();
		
		for(int i = 0; i < num+1; i++) {
			int x = scan.nextInt();
			list.add(x);
		}
		
		Collections.sort(list);
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < list.size()-1; i++) {
			set.add(list.get(i+1) - list.get(i));
			System.out.println("set:" + (list.get(i+1) - list.get(i)));
		}
		
		int g=0;
		for (int x : set) {
			g=gcd(g, x);
		}
		
		System.out.println(g);
	}
	static int gcd(int x,int y)
	{
		return y>0?gcd(y,x%y):x;
	}
}
