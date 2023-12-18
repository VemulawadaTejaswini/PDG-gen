import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] p = new int[M];
		int[] c = new int[N];
		int[] b = new int[N];
		int s = 0;
		int n = 0;
		for(int i=0; i<M; i++) {
			p[i] = (sc.nextInt()-1);
			String a = sc.next();
			if(a.equals("WA") ){
				if(c[p[i]]>=0)c[p[i]]++;
			}else if(a.equals("AC")) {
				b[p[i]]++;
				s += b[p[i]];
				n += c[p[i]];
				b[p[i]] = -1;
				c[p[i]] = -1;
			}

		}
		sc.close();
		if(n<0)n=0;
		System.out.println(s + " " + n);
	}

}