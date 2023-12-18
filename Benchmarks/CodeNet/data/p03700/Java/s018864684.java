import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int[] hps = new int[N];
		for(int i=0; i<N; i++){
			hps[i] = sc.nextInt();
		}
		sc.close();
		
		int count = 0;
		while(true){
			int max = 0;
			int maxIndex = -1;
			for(int i=0; i<N; i++){
				if(max<hps[i]){
					maxIndex = i;
					max = hps[i];
				}
			}
			if(max<=0){
				break;
			}
			
			for(int i=0; i<N; i++){
				if(i==maxIndex){
					hps[i] -= A;
				}else{
					hps[i] -= B;
				}
			}
			count++;
			
		}

		System.out.println(count);
		

	}

}