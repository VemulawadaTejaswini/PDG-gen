import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] cood = new int[N][2];
		for(int i = 0;i < N;++i) {
			cood[i][0] = sc.nextInt();
			cood[i][1] = sc.nextInt();
		}
		sc.close();
		
		int[] len = new int[N];
		int max_len = 0;
		for(int i = 0;i < N;++i) {
			len[i] = Math.abs(cood[i][0]) + Math.abs(cood[i][1]);
			if(len[i] > max_len)
				max_len = len[i];
		}
		
		boolean possible = true;
		for(int i = 0;i < N;++i) {
			if(max_len % 2 != len[i] % 2)
				possible = false;
		}
		if(!possible) {
			System.out.println("-1");
			return;
		}
		
		int arm_num = max_len;
		System.out.println(max_len);
		System.out.print("1");
		for(int i = 1;i < max_len;++i)
			System.out.print(" 1");
		System.out.println();
		
		int[] current = new int[2];
		for(int i = 0;i < N;++i) {
			current[0] = 0;
			current[1] = 0;
			for(int j = 0;j < arm_num;++j) {
				if(current[0] < cood[i][0]) {
					System.out.print("R");
					current[0] += 1;
				}else if(current[0] > cood[i][0]) {
					System.out.print("L");
					current[0] -= 1;
				}else if(current[1] < cood[i][1]) {
					System.out.print("U");
					current[1] += 1;
				}else if(current[1] > cood[i][1]) {
					System.out.print("D");
					current[1] -= 1;
				}else {
					System.out.print("RL");
					j++;
				}
			}
			System.out.println();
		}
		
	}
}
