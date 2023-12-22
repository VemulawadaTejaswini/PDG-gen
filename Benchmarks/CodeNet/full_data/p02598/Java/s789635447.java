import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int k = sc.nextInt();

		double[] a = new double[n];

		double[] splitedA = new double[n];

		int[] splitCnt = new int[n];

		for (int i=0; i<n; i++){
			a[i] = sc.nextDouble();
			splitedA[i] = a[i];
		}

		for (int i=1; i<=k; i++){

			double max=0;
			int maxIdx=0;
			for (int j=0; j<n; j++){

				if (j == 0){
					max = splitedA[j];
					maxIdx = j;
				} else {
					if (splitedA[j] > max){
						max = splitedA[j];
						maxIdx = j;
					}
				}
			}
			splitCnt[maxIdx]++;
			splitedA[maxIdx] = a[maxIdx] / (splitCnt[maxIdx] + 1);
		}

		Arrays.sort(splitedA);
		long ans = (long) Math.ceil(splitedA[n-1]);
		System.out.println(ans);
	}


}