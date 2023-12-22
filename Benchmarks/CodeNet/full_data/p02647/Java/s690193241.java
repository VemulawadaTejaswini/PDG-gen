import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] denkyu = new int[n];
		int[] tmpDenkyu = new int[n];
		for(int i = 0; i < n; i++){
			denkyu[i] = sc.nextInt();
			tmpDenkyu[i] = denkyu[i];
			if(denkyu[i] == 0){
				tmpDenkyu[i]++;
			}
		}
		for(int i = 0; i < k; i++){
			for(int j = 0; j < n; j++){
				for(int m = 0; m <= denkyu[j] * 2; m++){
					if( j - denkyu[j] + m >= 0 &&   j - denkyu[j] + m < n)
						if( j - denkyu[j] + m != j)
							tmpDenkyu[ j - denkyu[j] + m] ++;
				}

			}
		}

		for(int i = 0; i < n; i++){
			System.out.print(tmpDenkyu[i]);
			tmpDenkyu[i] = 0;
		}



	}
}