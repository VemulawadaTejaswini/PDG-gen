import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt(), M = scn.nextInt();
		boolean AC[] = new boolean[N];
		int pen = 0;
		int ac = 0;
		for(int i = 0;i < M;i++) {
			int p = scn.nextInt();
			char[] s = scn.next().toCharArray();
			if(s[0] == 'A') {
				AC[p-1] = true;
			}else {
				if(!AC[p-1]) {
					pen++;
				}
			}
		}
		for(int i = 0;i < N;i++) {
			if(AC[i])ac++;
		}
		System.out.println(ac + " " + pen);
	}

}
