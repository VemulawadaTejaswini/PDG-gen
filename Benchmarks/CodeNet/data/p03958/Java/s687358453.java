import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long K = scan.nextLong();
		int T = scan.nextInt();
		int a[] = new int[T];
		int max = 0;
		for(int i=0;i<T;i++){
			a[i] = scan.nextInt();
			max = Math.max(a[i], max);
		}

		if(T==1){
			System.out.println(a[0]-1);
			return;
		}

		Arrays.sort(a);

		int next_max = 0;
		int max_count = 0;
		for(int i=0;i<T;i++){
			if(a[i]<max){
				next_max = Math.max(next_max, a[i]);
			}else{
				max_count++;
			}
		}

		if(max_count>1){
			System.out.println(0);
			return;
		}

		int res = max-next_max-(T-1);
		if(res>0){
			System.out.println(max-next_max-(T-1));
		}else{
			System.out.println(0);
		}



	}

}