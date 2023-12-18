import java.util.Scanner;

public class Main {
	
	static void BubbleSort(int d[]){
		for(int i = d.length-1; i > 0; i--){
			for(int j = 0; j <i; j++){
				if(d[j] > d[j+1]){
					int work;
					work = d[j];
					d[j] = d[j+1];
					d[j+1] = work;
				}
				//printData(d);
				}
			}
	}
	
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int h[] = new int[N];

		for (int i = 0; i < N; i++) {
			h[i] = scan.nextInt();
		}
		
		BubbleSort(h);
		
		//System.out.println(N);
		//System.out.println(Arrays.toString(h));
		
		int ans;
		
		ans = h[N-1] - h[0];
		
		System.out.println(ans);
		
	}

}

