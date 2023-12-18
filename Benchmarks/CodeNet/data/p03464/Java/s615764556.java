import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int k = Integer.parseInt(br.readLine());
		int a[] = new int[k];
//		int b[] = new int[k];
		int b;
		String[] tmpArray = br.readLine().split(" ");
		for(int i = 0; i < k; i++){
			a[i] = Integer.parseInt(tmpArray[i]);
//			b[i] = a[i];
		}
		b = a[0];
		long min = 0;
		long max = 0;
		if(!(a[k-1] == 1 || a[k-1] == 2)){
			System.out.println(-1);
			return;
		}
		//find min
		for(int i = k - 2; i >= 0; i--){
			if(a[i] - a[i + 1] >= a[i + 1]){
				System.out.println(-1);
//				System.out.println((a[i] - a[i + 1])+" "+a[i + 1]);
				return;
			}

			else if(a[i] < a[i+1]){
				a[i] *= (a[i+1]/a[i])+1;
//				b[i]
			}

//			if(i != 0){
			min += a[i] - a[i+1];
			max += a[i] - a[i+1];
//			}
		}

//		for(int i = k - 2; i >= 0; i--){
//			if(b[i] - b[i + 1] > b[i + 1]){
//				System.out.println(-1);
//				return;
//			}
//
//			else if(b[i] < b[i+1]){
//				b[i] *= (b[i+1]/b[i])+2;
//				b[i]--;
//			}
//
//			max += b[i] - b[i+1];
////			}
//		}
		if(k != 1){
			min +=  2;
			max += b + 1;
		}
		else {
//		if(k == 1){
			if(a[0] == 1){
				min = 2;
				max = 2;
			}
			else {
				min = 2;
				max = 3;
			}
		}
//		else {
//			min += 2;
//			max += 2;
//			if(b[0] == 2){
//				max++;
//			}
//		}

		System.out.println(min+" "+max);

	}

}
