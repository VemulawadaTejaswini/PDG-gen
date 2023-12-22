import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int choice = sc.nextInt();
			int max = (int)Math.pow(2,n) - 1;
			for (int i = 1; i<=max; i++) {
				ArrayList<Integer> ans = new ArrayList<Integer>();
				ans.clear();
				String binary = Integer.toBinaryString(i);
				for (int j=0; j<binary.length(); j++) {
					char c =  binary.charAt(binary.length()-j-1);
					if (c == '1') {
						ans.add(j);  //部分集合をキープ
					}
				}
				if (ans.size() == choice) {
					System.out.print(i+":");
					for (int j=0; j<ans.size(); j++) System.out.print(" " + ans.get(j));
					System.out.print('\n');
				}
			}
		}
	}
}
