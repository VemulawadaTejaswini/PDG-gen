import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];

		for(int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
		}

		int[] sumA = new int[N];
		int[] sumB = new int[N];
		int[] sumC = new int[N];
		int count;

		if(N==1) {
			System.out.println(Math.max(a[0], Math.max(b[0], c[0])));
			System.exit(1);
		}

		for(count=1; count<N;count++) {
			if(count==1) {
				sumA[0] = a[1];
				sumB[0] = b[1];
				sumC[0] = c[1];

				sumA[1] = Math.max(sumA[0]+b[0],sumA[0]+c[0]);
				sumB[1] = Math.max(sumB[0]+a[0],sumB[0]+c[0]);
				sumC[1] = Math.max(sumC[0]+a[0],sumC[0]+b[0]);

//				System.out.println("count="+count+" "+sumA[count]+" "+sumB[count]+" "+sumC[count]+" ");
			}else {
			sumA[count] = Math.max(a[count]+sumB[count-1],a[count]+sumC[count-1]);
			sumB[count] = Math.max(b[count]+sumA[count-1],b[count]+sumC[count-1]);
			sumC[count] = Math.max(c[count]+sumA[count-1],c[count]+sumB[count-1]);

//			System.out.println("count="+count+" "+sumA[count]+" "+sumB[count]+" "+sumC[count]+" ");
			}
		}

		System.out.print(Math.max(sumA[N-1], Math.max(sumB[N-1], sumC[N-1])));
		scan.close();
	}

}
