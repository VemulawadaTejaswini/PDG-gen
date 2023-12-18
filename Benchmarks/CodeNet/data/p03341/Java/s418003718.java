import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = sc.next().split("");
		int west = 0;
		int east = 0;
		int[] westInfo = new int[n];
		for(int i =0;i <n;i++) {
			if(s[i].equals("W")) {
				west++;
			}else {
				east++;
			}
			westInfo[i] = west;
		}
		int[] turnInfo = new int[n];
		for(int i =0;i < n;i++) {
			//リーダーより西に居て西を向いてる人
			int wester = westInfo[i];
			if(s[i].equals("W")) {
				wester--;
			}
			//リーダーより東に居て東を向いてる人
			int easter = east - ((i+1) - westInfo[i]);
			turnInfo[i] = wester + easter;
		}
		int answer = Integer.MAX_VALUE;
		for(int i = 0;i < n;i++) {
			if(answer > turnInfo[i]) {
				answer = turnInfo[i];
			}
		}
		System.out.println(answer);

	}
}