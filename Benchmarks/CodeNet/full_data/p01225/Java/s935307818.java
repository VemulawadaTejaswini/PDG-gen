import java.util.*;
public class Main {
	
	boolean isSequenceNumber(int[] num) {
		int temp = num[0];
		for(int r = 1; r < num.length; r++) {
			temp++;
			if(num[r] != temp) return(false);
		}
		return(true);
	}
	
	boolean isMatchNumber(int[] num) {
		int first = num[0];
		for(int r = 1; r < num.length; r++) {
			if(num[r] != first) return(false);
		}
		return(true);
	}
	
	boolean isMatchCharacter(String[] str) {
		char first = str[0].charAt(0);
		for(int r = 0; r < str.length; r++) {
			if(str[r].charAt(0) != first) return(false);
		}
		return(true);
	}
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		
		int limit = stdIn.nextInt();
		for(int r = 0; r < limit; r++) {
			int[][] num = new int[3][3];
			String[][] str = new String[3][3];
			boolean flag = true;
			for(int c = 0; c < num.length; c++) {
				for(int k = 0; k < num[c].length; k++) {
					num[c][k] = stdIn.nextInt();
				}
			}
			for(int c = 0; c < str.length; c++) {
				for(int k = 0; k < str[c].length; k++) {
					str[c][k] = stdIn.next();
				}
			}
			
			for(int c = 0; c < 3; c++) {
				if(!((isSequenceNumber(num[c]) || isMatchNumber(num[c])) && isMatchCharacter(str[c]))) flag = false;
			}
			if(!flag) {
				flag = true;
				int[] counter = new int[3];
				for(int c = 0; c < str.length; c++) {
					for(int k = 0; k < str[c].length; k++) {
						switch(str[c][k].charAt(0)) {
						case 'R': counter[0]++; break;
						case 'G': counter[1]++; break;
						case 'B': counter[2]++; break;
						}
					}
				}
				if(counter[0] != 3 || counter[1] != 3 || counter[2] != 3) flag = false;
				for(int k = 0; k < 3; k++) {
					if(!((isSequenceNumber(num[k]) || isMatchNumber(num[k])))) flag = false;
					System.out.println("DEBUG:" + flag);
				}
			}
			System.out.println((flag) ? 1 : 0);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}