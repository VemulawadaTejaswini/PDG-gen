import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[3];
		for (int i=0;i<3;i++) {
			s[i] = sc.nextInt();
		}
		int cnt = 0;
		for (int i=0;i<3;i++) {
			if (s[i]==1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}