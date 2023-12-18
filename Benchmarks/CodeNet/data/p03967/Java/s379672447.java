
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		char[] input = sc.next().toCharArray();

//		int g[] = new int[input.length];
//		int p[] = new int[input.length];
//
//		for(int i = 1; i < input.length; i++){
//			if(input[i - 1] == 'g'){
//				g[i] = g[i - 1] + 1;
//				p[i] = p[i - 1];
//			}
//			else {
//				g[i] = g[i - 1];
//				p[i] = p[i - 1] + 1;
//			}
//
//			System.out.println(g[i] + " " + p[i]);
//		}

		int result = 0;
		int p = 0;
		int g = 1;
		for(int i = 1; i < input.length; i++){
//			if(input[i] == 'g' && p[i] + 1 <= g[i]){
			if(input[i] == 'g' && p + 1 <= g){
//				System.out.println("i = "+i);
				result++;
				p++;
			}
			else {
				g++;

				if(input[i] == 'p'){
					result--;
				}
			}

//			System.out.println("g "+g+" p "+p);
		}

		System.out.println(result);
	}

}
