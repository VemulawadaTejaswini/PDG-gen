import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	static ArrayList<String> list = new ArrayList<>();
	static String s;
	static int N;
	static String[] array; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.next();
		N = sc.nextInt();
		array = new String[N];
		array = s.split("");
		

		
	}
	/*
	 * kako 今まで
	 * kakoを足すのと足さないので分ける
	 */
	static String go(String s, int start) {
		list.add(array[start]);
		go(s + array[start], );
		go()
	}
}

