import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int count = 0;
		int count2 = 0;
		int count3= 0;
		int count4 = 0;
		for(int i = 0;i < N;i++) {
			String H = sc.nextLine();
			if(H.equals("AC")) {
				count++;
			}
			else if(H.equals("WA")) {
				count2++;
			}
			else if(H.equals("TLE")) {
				count3++;
			}
			else if(H.equals("RE")) {
				count4++;
			}
		}
		System.out.println("AC  x  " + count);
		System.out.println("WA  x  " + count2);
		System.out.println("TLE  x  " + count3);
		System.out.println("RE  x  " + count4);
	}
}