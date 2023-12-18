import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		sc.close();

		int cnt=0;
		for(int i=0;i<n-w+1;i++) {
			for(int j=0;j<n-h+1;j++) {
				cnt ++;
			}
		}

		System.out.println(cnt);
	}

}
