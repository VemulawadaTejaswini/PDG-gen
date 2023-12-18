import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		byte S[];
		String s = sc.next();
		S = s.getBytes();
		int Q = sc.nextInt();
		for (int i=0;i<Q;i++ ) {
			int T = sc.nextInt();
			if (T==1) {
				int p = sc.nextInt();
				String c = sc.next();
				S[p-1] =c.getBytes()[0];
			} else {
				int l = sc.nextInt();
				int r = sc.nextInt();
				int letter[];
				letter= new int[26];
				for (int j =l;j<=r;j++) {
					letter[S[j-1]-'a']++;
				}
				int count=0;
				for (int j=0;j<26;j++) {
					if (letter[j]>0)
						count++;
				}
				System.out.println(count);
			}
		}

	}
}