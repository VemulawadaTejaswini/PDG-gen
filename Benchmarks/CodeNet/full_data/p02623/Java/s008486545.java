import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		long K = sc.nextLong();
		long A[]=  new long[(int)N];
		long B[] = new long[(int)M];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		for (int i=0;i<M;i++) {
			B[i] = sc.nextLong();
		}
		long sum =0;
		int a=0;
		int b =0;
		long count =0;
		while (sum<=K) {
			if (a<N&&b<M) {
				if (A[a]<B[b]) {
					if (A[a]+sum<=K) {
						count++;
						sum =sum +A[a];
						a++;
					} else {
						break;
					}
				} else if (A[a]==B[b]) {
					boolean temp =false;
					boolean result= false;
					int tempa = a;
					int tempb =b;
					while (tempa<N&&tempb<M) {
						if (A[tempa]==B[tempb]) {
							tempa++;
							tempb++;
						} else if (A[a]<B[b]) {
							temp =true;
							break;
						} else {
							temp = true;
							result =true;
							break;
						}
					}
					if (temp==false ) {
						if (tempa<N-1) {
							if (A[a]+sum<=K) {
								count++;
								sum =sum +A[a];
								a++;
							} else {
								break;
							}
						} else if (tempb<M-1) {
							if (B[b]+sum<=K) {
								count++;
								sum =sum +B[b];
								b++;
							} else {
								break;
							}
						} else {
							if (A[a]+sum<=K) {
								count++;
								sum =sum +A[a];
								a++;
							} else {
								break;
							}
						}
					} else if (result ==true){
						if (B[b]+sum<=K) {
							count++;
							sum =sum +B[b];
							b++;
						} else {
							break;
						}
					} else {
						if (A[a]+sum<=K) {
							count++;
							sum =sum +A[a];
							a++;
						} else {
							break;
						}
					}
				} else {
					if (B[b]+sum<=K) {
						count++;
						sum =sum +B[b];
						b++;
					} else {
						break;
					}
				}
			} else if (a==N&&b==M) {
				break;
			} else if (a==N) {
				if (B[b]+sum<=K) {
					count++;
					sum =sum +B[b];
					b++;
				} else {
					break;
				}
			} else {
				if (A[a]+sum<=K) {
					count++;
					sum =sum +A[a];
					a++;
				} else {
					break;
				}
			}
		}
		System.out.println(count);
	}
}