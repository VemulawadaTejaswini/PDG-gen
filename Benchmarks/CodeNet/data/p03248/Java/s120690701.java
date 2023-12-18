import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int N = str.length();
		boolean[] how = new boolean[N];
		boolean can = true,f_exist = false;
		int f_start = -1;
		for(int i = 0;i < N;i++) {
			how[i] = '1' == str.charAt(i);
		}
		can = how[0] && how[N-2] && (!how[N-1]);
		
		for(int i = 1;i <= N/2-1;i++) {
			if(how[i]) {
				if(f_exist) {
					can = false;
					break;
				}else {
					if(!how[N-2-i]) {
						can = false;
						break;
					}
				}
			}else {
				if(!f_exist) {
				f_start = i;
				}
				f_exist = true;
			}
		}

		if(!can) {
			System.out.println(-1);
		}else {
			if(!f_exist) {
				for(int i = 0;i < N-1;i++) {
					System.out.println((i+1) + " " + (i + 2));
				}
			}else {
				for(int i = 0;i < N-1;i++) {
					if(i < f_start) {
						System.out.println((i+1) + " " + (i + 2));
					}else {
						System.out.println(1 + " " + (i+2));
					}
				}
			}
		}

		scn.close();
	}
}
