import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int cnt[]=new int[n];
		for(int i=0;i<n;i++) {
			cnt[i]=0;
		}
		for(int i=0;i<m;i++) {
			cnt[scan.nextInt()-1]+=1;
			cnt[scan.nextInt()-1]+=1;
		}
		scan.close();
		for(int i=0;i<n;i++) {
			System.out.println(cnt[i]);
		}

	}
}