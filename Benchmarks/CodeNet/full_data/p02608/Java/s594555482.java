    import java.util.Arrays;
import java.util.Scanner;

    	public class Main {

    		public static void main(String[] args) {
    			// AISing_C
    			Scanner sc = new Scanner(System.in);

    			int N = sc.nextInt();

    			int x=0, y=0, z=0;
    			int kai = 0;
    			int i = 0;

    			int[] ans = new int[N];
    			Arrays.fill(ans, 0);

    			double maxVal = Math.sqrt(N);

				for(x=1; x < maxVal; x++) {
					for(y=1; y <= x; y++) {
						for(z=1; z <= y; z++) {
							kai = x*x + y*y + z*z + x*y + y*z + z*x;
							for(i=0; i<N; i++) {
								if(kai == i) {
									if(x==y && y==z) {
										ans[i-1] += 1;
									} else {
										ans[i-1] += 3;
									}
								}
							}
						}
					}
				}
				for(i=0; i<N; i++) {
					System.out.println(ans[i]);
				}

        	    // Scannerクラスのインスタンスをクローズ
        		sc.close();
        	}

        }