import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {

//		long ans = 0;
//		double ans = 0.0;
		int ans = 0;
//		String ans = "";

		Scanner sc = new Scanner(System.in);
//		double waru = 1000000007;


//		long n = sc.nextLong();
//		long m = sc.nextLong();
//		long k = sc.nextLong();

		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int k = sc.nextInt();
//		int v = sc.nextInt();
//		String s = sc.next();


//		String string = sc.next();
//		StringBuilder s = new StringBuilder(string);

		boolean f = false;

//		String[] s = new String[n];

//		int[] a = new int[n];
//		int[] b = new int[n];
		long[] a = new long[n];
		long[] b = new long[n];
//		int[][] a = new int[n][m];

		Map<Long, Long> map = new HashMap<>();


//		for (int i = 0; i < h; i++) {
//			for(int j = 0; j < w; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
			b[i] = sc.nextLong();
//			map.put(sc.nextLong(), sc.nextLong());
		}


		for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[i]){
                    long temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    long temp2 = b[i];
                    b[i] = b[j];
                    b[j] = temp2;
                }
            }
        }

//		Object[] mapkey = map.keySet().toArray();
//        Arrays.sort(mapkey);

		int index = 0;
		for(int i = 0; i < n-1; i ++) {
			if(a[index] + b[index] > a[i+1] - b[i+1]) {
				ans++;
			} else {
				index = i;
			}
		}






		System.out.println(n-ans);

		sc.close();
	}


}