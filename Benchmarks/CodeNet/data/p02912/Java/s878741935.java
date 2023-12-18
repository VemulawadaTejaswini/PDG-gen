import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        long[] list = new long[N];
        for (int i=0; i < N ; i++) {
        	list[i] = Long.parseLong(sc.next()); ;
        }
        sc.close();

        Arrays.sort(list);
        for (int i = 0; i < M ; i++) {
        	list[N-1] /= 2;

    		for (int j = N-1; j> 0 ; j--) {
    			if( list[j] > list [j-1] ) {
    				break;
    		}
    			long temp = list [j];
    			list[j] = list[j-1];
    			list[j-1] = temp;
        	}
        }
        long sum = 0;
        for (int i = 0; i < N ; i++ ) {
        	sum += (list[i]);
        }

		System.out.println(sum);


    }
}