import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
	
		boolean[] dic = new boolean[1 << 24];
		
		for (int i = 0; i < n; i++) {
			String[] line = sc.nextLine().split(" ");
			
			String cmd = line[0];
			String str = line[1];
			
			if (cmd.equals("insert")) {
				dic[getIndex(str)] = true;
			} else if (cmd.equals("find")) {
				if (dic[getIndex(str)]) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
	
	public static int getIndex(String str) {
		int index = 0;
		for (int j = str.length() - 1; j >= 0; j--) {
			char c = str.charAt(j);
			switch(c) {
			case 'A':
				index |= (0 << j*2);
				break;
			case 'C':
				index |= (1 << j*2);
				break;
			case 'G':
				index |= (2 << j*2);
				break;
			case 'T':
				index |= (3 << j*2);
				break;
			}
		}
		return index;
	}
}