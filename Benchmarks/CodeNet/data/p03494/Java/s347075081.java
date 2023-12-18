import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inLength;
		inLength = sc.nextInt();
		
		long[] input = new long[inLength];
		for(int i =0 ; i < inLength;i++) {
			input[i] = sc.nextInt();
		}
		int result = 0;
		boolean flg = false;
		while(flg == false) {
			for(int j =0 ; j < inLength;j++) {
				if(input[j] % 2 == 1) {
					flg = true;
					break;
				}
				input[j] = input[j] / 2;
				if(input[j] == 0) {
					flg = true;
				}
				
			}
			if(flg == false) {
				result++;
			}
		}
		
		System.out.println(result);

	}

}