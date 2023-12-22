
import java.util.Scanner;

public class Main {


	static int S[];
	static int n;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		S = new int[n];
		for(int i = 0;i < n;i++)S[i] = scan.nextInt();
		int q = scan.nextInt();
		int c = 0;
		for(int i = 0;i < q;i++) {
			if(search(scan.nextInt()))c++;

		}

		System.out.println(c);
		scan.close();

	}

	static boolean search(int t) {
		int l = 0, r = n, mid;
		if(S[0] > t || S[n-1] < t)return false;

		while(l<r) {
			mid = (l+r)/2;
			if(S[mid] > t) {
				r = (l+r)/2;
			}else if(S[mid] < t){
				l = (l+r)/2+1;
			}else if(S[mid] == t)return true;

		}

		return false;

	}

}
