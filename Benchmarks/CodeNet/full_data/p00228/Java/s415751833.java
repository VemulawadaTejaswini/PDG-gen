import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"0111111","0000110","1011011","1001111","1100110","1101101","1111101","0100111","1111111","1101111"};
						//0			1		2			3			4		5		6			7		8			9
		while(true){
			int n = sc.nextInt();
			if(n == -1) break;
			for(int i = 0 ; i < n ; i++){
				int num = sc.nextInt();
				System.out.println(s[num]);
			}
		}
		sc.close();
	}

}