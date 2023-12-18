import java.util.Arrays;
import java.util.Scanner;

class Main{

	static long ans = 0;
	static int N;
	static long M;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力

		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];

		for(int i = 0;i < n;i++){
			a[i]=sc.nextInt();
		}
		for(int i = 0;i < n;i++){
			b[i]=sc.nextInt();
		}
		for(int i = 0;i < n;i++){
			c[i]=sc.nextInt();
		}

		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);


		int[] countc = new int[n];
		for(int i = 0;i < n;i++){
			if(c[0] > b[i]){
				countc[0]++;
			}else{
				break;
			}	
		}
		
		for(int i = 1;i < n;i++){
			countc[i] = countc[i-1];
			for(int j = countc[i-1];j < n;j++){
				if(c[i] > b[j]){
					countc[i]++;
				}else{
					break;
				}
			}
		}
		
		int[] countb = new int[n];
		for(int i = 0;i < n;i++){
			if(b[0] > a[i]){
				countb[0]++;
			}else{
				break;
			}	
		}
		for(int i = 1;i < n;i++){
			countb[i] = countb[i-1];
			for(int j = countb[i-1];j < n;j++){
				if(b[i] > a[j]){
					countb[i]++;
				}else{
					break;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0;i < n;i++){
			if(countc[i] > 0){
				for(int j = 0;j < countc[i];j++){
					ans += countb[j];
				}
			}
		}
		System.out.println(ans);





	}


}



