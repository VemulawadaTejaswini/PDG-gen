import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		
		long div = N;
		int mod = 0;
		
		List<Integer> list = new ArrayList<>();
		
		while(true) {
			mod = (int) (div % 26);
			div = div / 26;
			
			list.add(mod);
			
			if(div == 0) {
				break;
			}
		}
		
		Collections.reverse(list);
		
		for(int i : list) {
			
			switch(i) {
			case 1 :
				System.out.print("a");
				break;
			case 2 :
				System.out.print("b");
				break;
			case 3 :
				System.out.print("c");
				break;
			case 4 :
				System.out.print("d");
				break;
			case 5 :
				System.out.print("e");
				break;
			case 6 :
				System.out.print("f");
				break;
			case 7 :
				System.out.print("g");
				break;
			case 8 :
				System.out.print("h");
				break;
			case 9 :
				System.out.print("i");
				break;
			case 10 :
				System.out.print("j");
				break;
			case 11 :
				System.out.print("k");
				break;
			case 12 :
				System.out.print("l");
				break;
			case 13 :
				System.out.print("m");
				break;
			case 14 :
				System.out.print("n");
				break;
			case 15 :
				System.out.print("o");
				break;
			case 16 :
				System.out.print("p");
				break;
			case 17 :
				System.out.print("q");
				break;
			case 18 :
				System.out.print("r");
				break;
			case 19 :
				System.out.print("s");
				break;
			case 20 :
				System.out.print("t");
				break;
			case 21 :
				System.out.print("u");
				break;
			case 22 :
				System.out.print("v");
				break;
			case 23 :
				System.out.print("w");
				break;
			case 24 :
				System.out.print("x");
				break;
			case 25 :
				System.out.print("y");
				break;
			case 26 :
				System.out.print("z");
				break;					
			}
		}
	}
}
