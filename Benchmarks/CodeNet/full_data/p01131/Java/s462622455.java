import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[][] key = new String[10][5];
		key[1] = new String[] {".",",","!","?"," "};
		key[2] = new String[] {"a","b","c"};
		key[3] = new String[] {"d","e","f"};
		key[4] = new String[] {"g","h","i"};
		key[5] = new String[] {"j","k","l"};
		key[6] = new String[] {"m","n","o"};
		key[7] = new String[] {"p","q","r","s"};
		key[8] = new String[] {"t","u","v"};
		key[9] = new String[] {"w","x","y","z"};
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			String tmp = stdIn.next();
			for(int j = 0; j < tmp.length(); j++) {
				char c = tmp.charAt(j++);
				int ks = 0;
				if(c == '0') {
					j--;
					continue;
				}
				while(true) {
					char p = tmp.charAt(j++);
					if(p == '0') {
						j--;
						break;
					}
					ks++;
				}
				int ss = Integer.parseInt(String.valueOf(c));
				System.out.print(key[ss][ks%key[ss].length]);
			}
			System.out.println();
		}
		
	}
	
}