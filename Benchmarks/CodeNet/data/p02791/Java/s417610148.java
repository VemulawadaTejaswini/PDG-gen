import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=scan.nextInt();
		}
		scan.close();

		int cnt=0;
		for(int i=0;i<n;i++) {
			int check=1;
			for(int j=0;j<i;j++) {
				if(p[i]>p[j]) {
					check=0;
					break;
				}
			}
			if(check==1) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}