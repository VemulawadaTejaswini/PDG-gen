import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		long sum=0;
		int i=0;
		int count =0;
		int beforeCount =0;
		while (i<S.length()) {
			count =0;
			if (S.charAt(i)=='<') {
				while(i<S.length()&&S.charAt(i)=='<') {
					i++;
					count++;
				}
				sum +=count*(count+1)/2;
				beforeCount = count;
			} else if (S.charAt(i)=='>') {
				while(i<S.length()&&S.charAt(i)=='>') {
					i++;
					count++;
				}
				if (beforeCount<count) {
					sum +=count*(count+1)/2-beforeCount;
				} else {
					sum +=count*(count-1)/2;
				}
			}
		}
		System.out.println(sum);
	}
}
