import java.util.Scanner;
import java.util.Arrays;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
		long K = sc.nextLong();

		int[] a = new int[N];
		int[] b = new int[N];

		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		int[] sort = new int[N];
		for(int i=0; i<N; i++){
			sort[i] = i;
		}

		int t;
   	for(int i=0; i<N-1; i++){
    	for(int j=N-1; j>i; j--){
    		if(a[j-1]>a[j]){
	      	t = a[j-1];	a[j-1] = a[j];	a[j] = t;
					t = sort[j-1];	sort[j-1] = sort[j];	sort[j] = t;
				}
			}
	  }

		int ans = 0;
		for(int i=0; i<N; i++){
			K -= b[sort[i]];
			if(K<=0){
				ans = i;
				break;
			}
		}

    System.out.print(a[ans]);

	}

}
