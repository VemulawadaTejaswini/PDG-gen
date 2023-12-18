import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean reverseFlag = false;
		StringBuilder answer = new StringBuilder();
		answer.append(s);
		for(int i =0;i < q;i++) {
			int t = sc.nextInt();
			if(t ==1) {
				if(reverseFlag) {
					reverseFlag = false;
				}else {
					reverseFlag = true;
				}
			}else {
				int f = sc.nextInt();
				if(f == 1) {
					if(reverseFlag) {
						answer.append(sc.next());
					}else {
						answer.insert(0, sc.next());
					}
				}else {
					if(reverseFlag) {
						answer.insert(0, sc.next());
					}else {
						answer.append(sc.next());
					}
				}
			}
		}
		if(reverseFlag) {
			String[] answerArray = answer.toString().split("");
			StringBuilder sb = new StringBuilder();
			for(int i= answerArray.length -1;i >=0;i--) {
				sb.append(answerArray[i]);
			}
			System.out.println(sb);

		}else {
			System.out.println(answer);
		}
	}
}