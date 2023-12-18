import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int q = sc.nextInt();
		boolean reverseFlag = false;

		StringBuilder front = new StringBuilder();
		StringBuilder back = new StringBuilder();
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
						back.append(sc.next());
					}else {
						front.insert(0, sc.next());
					}
				}else {
					if(reverseFlag) {
						front.insert(0, sc.next());
					}else {
						back.append(sc.next());
					}
				}
			}
		}
		StringBuilder answer = new StringBuilder();
		answer.append(front);
		answer.append(s);
		answer.append(back);
		if(reverseFlag) {
			System.out.println(answer.reverse());

		}else {
			System.out.println(answer);
		}
	}
}