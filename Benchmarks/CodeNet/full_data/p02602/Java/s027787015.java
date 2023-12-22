import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// M-SOL_2020_C
			Scanner sc = new Scanner(System.in);

//	        System.out.println("Short.MAX_VALUE: "+Short.MAX_VALUE);
//	        System.out.println("Short.MIN_VALUE: "+Short.MIN_VALUE);
//	        System.out.println("Integer.MAX_VALUE: "+Integer.MAX_VALUE);
//	        System.out.println("Integer.MIN_VALUE: "+Integer.MIN_VALUE);
//	        System.out.println("Long.MAX_VALUE: "+Long.MAX_VALUE);
//	        System.out.println("Long.MIN_VALUE: "+Long.MIN_VALUE);
//	        System.out.println("Float.MAX_VALUE: "+Float.MAX_VALUE);
//	        System.out.println("Float.MIN_VALUE: "+Float.MIN_VALUE);
//	        System.out.println("Double.MAX_VALUE: "+Double.MAX_VALUE);
//	        System.out.println("Double.MIN_VALUE: "+Double.MIN_VALUE);

			int N = sc.nextInt();
			int K = sc.nextInt();
			Double A[] = new Double[N];

			Double now = (double) 1;
			Double bef = (double) 0;

			for(int i=0; i<N; i++) {
				A[i] = sc.nextDouble();
			}

			for(int i=0; i<K; i++) {
				now *= A[i];
			}

			for(int i=K; i<N; i++) {
				bef = now;
				if(A[i-K] == 0) {
					now = (double) 1;
					for(int j=i-K+1; j<=i; j++) {
						now *= A[j];
					}
				} else {
					now = now/A[i-K]*A[i];
				}

				if(now > bef) {
		    		System.out.println("Yes");
				} else {
		    		System.out.println("No");
				}
			}

    	    // Scannerクラスのインスタンスをクローズ
    		sc.close();
    	}
    }