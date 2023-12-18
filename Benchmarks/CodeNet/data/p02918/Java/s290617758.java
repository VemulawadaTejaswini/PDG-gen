import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k =  Integer.parseInt(sc.next());
		String s[] = sc.next().split("");
		int loop = 0;
		int cnt = 0;

		for (int i=0 ; i < n -1 ; i++) {
			if(s[i].equals(s[i+1])) {
				cnt++;
			}

		}

		while(cnt < n -1 && loop < k ) {


			cnt += 2;
			loop++;
		}
		if(cnt > n -1) {
			cnt = n-1;
		}

		System.out.println(cnt);
	}

}