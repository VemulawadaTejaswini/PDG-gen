import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}

		int minusCnt = 0;
		int plusCnt = 0;
		int minSadness = 0;
		int sadness = 0;
		int difference[] = new int[n];
		for (int i=0; i<n; i++){
			difference[i] = a[i] - (i+1);
			sadness += Math.abs(a[i] - (i+1));
			if (a[i] -(i+1) > 0){
				plusCnt++;
			} else if (a[i] - (i+1)< 0){
				minusCnt++;
			}
		}
		minSadness = sadness;

		if (plusCnt > minusCnt){
			while (true){
				sadness = 0;
				for (int i=0; i<n; i++){
					difference[i]--;
					sadness += Math.abs(difference[i]);
				}
				if (sadness >= minSadness){
					break;
				} else {
					minSadness = sadness;
				}
			}
		} else {
			while (true){
				sadness = 0;
				for (int i=0; i<n; i++){
					difference[i]++;
					sadness += Math.abs(difference[i]);
				}
				if (sadness >= minSadness){
					break;
				} else {
					minSadness = sadness;
				}
			}
		}
		System.out.println(minSadness);
	}
}