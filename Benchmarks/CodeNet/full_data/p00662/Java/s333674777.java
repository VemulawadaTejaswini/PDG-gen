import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] input = new int[6];
		int cnt = 0;
		while(true){
			cnt = 0;
			for(int i=0 ; i<input.length ; i++) {
				input[i] = s.nextInt();
				if(input[i] == 0)
					cnt++;
			}
			if(cnt==6)
				break;
			solve(input);
		}
	}

	public static void solve(int[] input) {
		boolean flg = false;
		int result = 0;
		while(true) {
			flg = false;
			if(input[0]>1 && input[3]>0) {
				input[0] = input[0] - 2;
				input[3] = input[3] - 1;
				result++;
				flg = true;
			}else if(input[0]>0 && input[3]>1) {
				input[0] = input[0] - 1;
				input[3] = input[3] - 2;
				result++;
				flg = true;
			}else if(input[1]>1 && input[4]>0) {
				input[1] = input[1] - 2;
				input[4] = input[4] - 1;
				result++;
				flg = true;
			}else if(input[1]>0 && input[4]>1) {
				input[1] = input[1] - 1;
				input[4] = input[4] - 2;
				result++;
				flg = true;
			}else if(input[2]>1 && input[5]>0) {
				input[2] = input[2] - 2;
				input[5] = input[5] - 1;
				result++;
				flg = true;
			}else if(input[2]>0 && input[5]>1) {
				input[2] = input[2] - 1;
				input[5] = input[5] - 2;
				result++;
				flg = true;
			}else if(input[0]>0&&input[1]>0&&input[2]>0) {
				input[0] = input[0] - 1;
				input[1] = input[1] - 1;
				input[2] = input[2] - 1;
				result++;
				flg = true;
			}else if(input[0]>0&&input[1]>0&&input[5]>0) {
				input[0] = input[0] - 1;
				input[1] = input[1] - 1;
				input[5] = input[5] - 1;
				result++;
				flg = true;
			}else if(input[0]>0&&input[4]>0&&input[2]>0) {
				input[0] = input[0] - 1;
				input[4] = input[4] - 1;
				input[2] = input[2] - 1;
				result++;
				flg = true;
			}else if(input[0]>0&&input[4]>0&&input[5]>0) {
				input[0] = input[0] - 1;
				input[4] = input[4] - 1;
				input[5] = input[5] - 1;
				result++;
				flg = true;
			}else if(input[3]>0&&input[1]>0&&input[2]>0) {
				input[3] = input[3] - 1;
				input[1] = input[1] - 1;
				input[2] = input[2] - 1;
				result++;
				flg = true;
			}else if(input[3]>0&&input[1]>0&&input[5]>0) {
				input[3] = input[3] - 1;
				input[1] = input[1] - 1;
				input[5] = input[5] - 1;
				result++;
				flg = true;
			}else if(input[3]>0&&input[4]>0&&input[2]>0) {
				input[3] = input[3] - 1;
				input[4] = input[4] - 1;
				input[2] = input[2] - 1;
				result++;
				flg = true;
			}else if(input[3]>0&&input[4]>0&&input[5]>0) {
				input[3] = input[3] - 1;
				input[4] = input[4] - 1;
				input[5] = input[5] - 1;
				result++;
				flg = true;
			}
			if(!flg)
				break;
		}
		System.out.println(result);
	}
}