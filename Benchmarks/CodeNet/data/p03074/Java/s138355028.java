
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		char[] list = sc.next().toCharArray();
		int number = serch(list, K);
		System.out.println(number);
	}

	static int serch(char[] list, int K) {
		int count = 0;
		int number = 0;
		boolean flag = false;
		char head = list[0];
		boolean induction = true;
		int indnum = 0;
		for(int i = 0; i < list.length; i++) {
			if(list[i] == '0') {
				if((head == '1') && induction) {
					indnum = serch(Arrays.copyOfRange(list, i, list.length), K);
					induction = false;
				}
				if(!flag) {
					count++;
					flag = true;
				}
				if(count > K) {
					break;
				}
				number++;
			} else {
				if((head == '0') && induction) {
					indnum = serch(Arrays.copyOfRange(list, i, list.length), K);
					induction = false;
				}
				flag = false;
				number++;
			}
		}

		return Integer.max(number, indnum);
	}

}
