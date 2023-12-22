import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] input = new int[6];
		int[] input2 = new int[3];
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
			input2[0] = input[0] + input[3];
			input2[1] = input[1] + input[4];
			input2[2] = input[2] + input[5];
			solve(input2);
		}
	}

	public static void solve(int[] input) {
		boolean flg = false;
		int result = 0;
		while(true) {
			flg = false;
			if(input[0]>2) {
				input[0] = input[0] - 3;
				result++;
				flg = true;
			}else if(input[1]>2) {
				input[1] = input[1] - 3;
				result++;
				flg = true;
			}else if(input[2]>2) {
				input[2] = input[2] - 3;
				result++;
				flg = true;
			}else if(input[0]>0&&input[1]>0&&input[2]>0) {
				input[0] = input[0] - 1;
				input[1] = input[1] - 1;
				input[2] = input[2] - 1;
				result++;
				flg = true;
			}
			if(!flg)
				break;
		}
		System.out.println(result);
	}
}