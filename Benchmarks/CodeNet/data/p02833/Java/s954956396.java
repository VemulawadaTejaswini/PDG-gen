import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long S[] = new long[3];
		S[0] = 1;
		S[1] = 1;
		S[2] = 2;
		
		for(long i=3;i<=N;i++) {
			S[(int)(i%3)] = i*S[(int)((i-2)%3)];
		}
		
		int pp = (int)(N%3);
		int count = 0;
		for(int i=0;i<100;i++) {
			if(S[pp]%10==0) {
				S[pp] /= 10;
				count++;
			}else {
				break;
			}
		}
		System.out.println(count);
	}
}