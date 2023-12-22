import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int n = 5;
		int i = 0;
		ArrayList<Integer> parse = new ArrayList<Integer>(); // int??????
		while (true) { // ?????§10000???
				Scanner scan = new Scanner(System.in);
				a = scan.nextInt();
				parse.add(a);
				if(a == 0){
					break;
				}
				i++;
				if(i == n){
					break;
				}
		}
		for(int j = 0; j < parse.size(); ++j){
			if(parse.get(j) != 0){
		System.out.println("Case " + (j+1) + ": " + parse.get(j));
			}
		}
	}
}