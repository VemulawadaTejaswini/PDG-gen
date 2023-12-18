import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.nextLine();
		scan.close();
		String []a = S.split("");
		int cntrW[] = new int[N];
		int cntrE[] = new int[N];
		int cntlW[] = new int[N];
		int cntlE[] = new int[N];
		int cntW = 0;
		int cntE = 0;
		cntlW[0] = 0;
		cntlE[0] = 0;
		cntrW[N - 1] = 0;
		cntrE[N - 1] = 0;
		for(int i = 0; i < N; i++) {
			if(a[i].equals("W")) {
				cntW ++;
			}
		}
		cntE = N - cntW;
		if(a[0].equals("W")) {
			cntrW[0] = cntW - 1;
			cntrE[0] = cntE;
		}else {
			cntrW[0] = cntW;
			cntrW[0] = cntE - 1;
		}

		for(int i = 1; i < N - 1; i++) {
			if(a[i].equals("W")) {
				cntrW[i] = cntrW[i - 1] - 1;
				cntrE[i] = cntrE[i - 1];
			}else {
				cntrW[i] = cntrW[i - 1];
				cntrE[i] = cntrE[i - 1] - 1;
			}
		}

		if(a[N - 1].equals("W")){
			cntlW[N - 1] = cntW - 1;
			cntlE[N - 1] = cntE;
		}else {
			cntlW[N - 1] = cntW;
			cntlE[N - 1] = cntE - 1;
		}
		for(int i = N - 2; i >= 1; i--) {
			if(a[i].equals("W")) {
				cntlW[i] = cntlW[i + 1] - 1;
				cntlE[i] = cntlE[i + 1];
			}else {
				cntlW[i] = cntlW[i + 1];
				cntlE[i] = cntlE[i + 1] - 1;
			}
		}
		//int []k = new int[N];
		int min = 10000000;
		int k = 0;
		for(int i = 0; i < N; i++) {
			if(a[i].equals("W")) {
				k = cntrE[i] + cntlW[i];
			}else {	// E と等しい
				k = cntrE[i] + cntlW[i];
			}
			if(k <= min) {
				min = k;
			}
			if(k == 0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		for(int i = 0; i < N; i++) {
			int sum = cntrW[i] + cntrE[i] + cntlW[i] + cntlE[i];
			if(sum != N) {
				N = N + 1;
			}
		}
		System.out.println(min);

//		System.out.println(cntW + " " + cntW);
//		for(int i = 0; i < N; i++) {
//			System.out.print(i + " left: E " + cntlE[i] + " / W " + cntlW[i]);
//			System.out.println(" right: E " + cntrE[i] + " / W " + cntrW[i]);
//		}

	}
}