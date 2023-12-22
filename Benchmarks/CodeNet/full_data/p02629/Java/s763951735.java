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
		
		
		StringBuilder sb = new StringBuilder();
		
		for(int i : list) {
			
			switch(i) {
			case 1 :
				sb.append("a");
				break;
			case 2 :
				sb.append("b");
				break;
			case 3 :
				sb.append("c");
				break;
			case 4 :
				sb.append("d");
				break;
			case 5 :
				sb.append("e");
				break;
			case 6 :
				sb.append("f");
				break;
			case 7 :
				sb.append("g");
				break;
			case 8 :
				sb.append("h");
				break;
			case 9 :
				sb.append("i");
				break;
			case 10 :
				sb.append("j");
				break;
			case 11 :
				sb.append("k");
				break;
			case 12 :
				sb.append("l");
				break;
			case 13 :
				sb.append("m");
				break;
			case 14 :
				sb.append("n");
				break;
			case 15 :
				sb.append("o");
				break;
			case 16 :
				sb.append("p");
				break;
			case 17 :
				sb.append("q");
				break;
			case 18 :
				sb.append("r");
				break;
			case 19 :
				sb.append("s");
				break;
			case 20 :
				sb.append("t");
				break;
			case 21 :
				sb.append("u");
				break;
			case 22 :
				sb.append("v");
				break;
			case 23 :
				sb.append("w");
				break;
			case 24 :
				sb.append("x");
				break;
			case 25 :
				sb.append("y");
				break;
			case 26 :
				sb.append("z");
				break;					
			}
		}
		System.out.println(sb);
	}
}