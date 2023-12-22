import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int w = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int hist[] = new int[101];
			
			int max = 0;
			int right = 0;
//			int input[] = new int[n];
			for(int i = 0; i < n; i++){
				int tmp = sc.nextInt();
				hist[tmp/w]++;
				max = Math.max(max, hist[tmp/w]);
				right = Math.max(right, tmp/w);
			}
			
			//debug
//			System.out.println("max "+max);
//			for(int i = 0; i < hist.length ; i++){
//				System.out.print(hist[i]+" ");
//			}
//			System.out.println();
			
			double result = 0.01;
			
			int bars = right + 1;
			for(int i = 0; i < n; i++){
				result += (double)hist[i]/max * (bars - i - 1)/(bars - 1);
//				System.out.println("i = "+i+" result = "+result);
			}
			
			
			System.out.println(result);
			
		}

	}

}

