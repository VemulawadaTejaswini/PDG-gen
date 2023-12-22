import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] cc = new int[]{512,256,128,64,32,16,8,4,2,1};
		boolean[] ck = new boolean[cc.length];
		while(stdIn.hasNext()) {
			int n = stdIn.nextInt();
			for(int i = 0; i < cc.length; i++) {
				if(n - cc[i] >= 0) {
					ck[i] = true;
					n -= cc[i];
				}
			}
			boolean check = false;
			for(int i = cc.length-1; i >= 0; i--) {
				if(ck[i]) {
					if(check) {
						System.out.print(" " +cc[i]);
					}
					else {
						System.out.print(cc[i]);
						check = true;
					}
				}
				
			}
			System.out.println();
		}
	}
}