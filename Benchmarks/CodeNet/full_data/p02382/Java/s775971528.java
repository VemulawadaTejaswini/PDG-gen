import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static double minkDist(int[] a, int[] b, int n, int p){
		double result = 0;
		
		double max = 0;
		for(int i = 0; i < n; i++){
			result += Math.pow(Math.abs(a[i] - b[i]), p);
			
			if(max < Math.abs(a[i] - b[i])){
				max = Math.abs(a[i] - b[i]);
			}
		}
		
		if(p == Integer.MAX_VALUE){
			return max;
		}
		else {
			return Math.pow(result, 1.0/p);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


//		String str = br.readLine();

//		while(true){
		int n = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		int[] b = new int[n];

		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(tmpArray[i]);
		}

		tmpArray = br.readLine().split(" ");
		for(int i = 0; i < n; i++){
			b[i] = Integer.parseInt(tmpArray[i]);
		}
		
		System.out.println(minkDist(a, b, n, 1));
		System.out.println(minkDist(a, b, n, 2));
		System.out.println(minkDist(a, b, n, 3));
		System.out.println(minkDist(a, b, n, Integer.MAX_VALUE));
		
//
//			if(n == 0){
//				break;
//			}
//			String[] tmpArray = br.readLine().split(" ");
//			int[] input = new int[n];
//			int sum = 0;
//			for(int i = 0; i < n ; i++){
//				input[i] = Integer.parseInt(tmpArray[i]);
//				sum += input[i];
//			}
//			double ave = (double)sum / n;
//
//			double var = 0;
//			for(int i = 0; i < n ; i++){
//				var += Math.pow((input[i] - ave) , 2)/n;
//			}
//
//			System.out.println(Math.pow(var, 0.5));
//		}
//		System.out.println(p1.distance(p2));


//		System.out.println(count);

//
//			if(Character.isLowerCase(c)){
//				System.out.print(Character.toUpperCase(c));
//			}
//
//			else if(Character.isUpperCase(c)){
//				System.out.print(Character.toLowerCase(c));
//			}
//			else {
//				System.out.print(c);
//			}
//		}
//		System.out.println();

//		String[] tmpArray = br.readLine().split(" ");
//		int n = Integer.parseInt(tmpArray[0]);
//		int m = Integer.parseInt(tmpArray[1]);
//		int l = Integer.parseInt(tmpArray[2]);
//
//		long[][] a = new long[n][m];
//		long[][] b = new long[m][l];
//		long[][] c = new long[n][l];
//
//		for(int i = 0; i < n; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < m; j++){
//				a[i][j] = Long.parseLong(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < m; i ++){
//			tmpArray = br.readLine().split(" ");
//			for(int j = 0; j < l; j++){
//				b[i][j] = Integer.parseInt(tmpArray[j]);
//			}
//		}
//
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < l; j++){
//				for(int k = 0; k < m; k++){
//					c[i][j] += a[i][k]*b[k][j];
//				}
//
//				if(j != 0 ){
//					System.out.print(" ");
//				}
//				System.out.print(c[i][j]);
//			}
//			System.out.println();
//		}


	}

}