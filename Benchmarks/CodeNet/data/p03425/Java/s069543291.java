import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int ary[] = {0, 0, 0, 0, 0}; //M, A, R, C, H
		for(int i=0; i<N; i++) {
			char c = sc.next().charAt(0);
			switch(c) {
			case 'M': ary[0]++; break;
			case 'A': ary[1]++; break;
			case 'R': ary[2]++; break;
			case 'C': ary[3]++; break;
			case 'H': ary[4]++;
			}
		}
		sc.close();
		long x = 0L;
		
		for(int i=0; i<=2; i++) {
			for(int j=i+1; j<=3; j++) {
				for(int k=j+1; k<=4; k++) {
					x += ary[i] * ary[j] * ary[k];
				}
			}
		}
		System.out.println(x);
	}

}