import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		sc.close();

		int count = 1;
		long tmp = 0;
		if(N <= 26) {
			tmp = N;
		}
		for(int i = 1; ;i++) {
			N -= (int) Math.pow(26, i);
			if(N > 0) {
				count++;
				tmp = N;
			}else {
				break;
			}
		}

		StringBuffer sb = new StringBuffer();
		for(int i = 1; i <= count;i++) {
			char ch = 'a';
			long che = tmp - (int) Math.pow(26, count - i);
			long tmpCount = 0;
			while(che > 0) {
				ch++;
				che -= (int) Math.pow(26, count - i);
				tmpCount++;
			}
			sb.append(ch);
			tmp -= tmpCount * (int) Math.pow(26, count - i);
		}
		System.out.println(sb.toString());

	}

}