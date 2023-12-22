import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[1000001];
		
		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}
			//System.gc();
			//int[] array = new int[N];
			
			
			Arrays.fill(array, -1);
			for(int i = 0; i < N; i++){
				array[i] = sc.nextInt();
			}
			
			Arrays.sort(array);
			
			int count = 1;
			boolean flag = false;;
			int offset = 1000001 - N;
			int prev = array[0 + offset];
			for(int i = 1 + offset; i < N + offset; i++){
				if(prev == array[i]){
					count++;
				}else{
					if(count > N / 2){
						System.out.println(prev);
						flag = true;
						break;
					}
					
					prev = array[i];
					count = 1;
				}
			}
			
			if(count > N / 2){
				System.out.println(prev);
				flag = true;
			}
			
			if(!flag){
				System.out.println("NO COLOR");
			}
			
		}

	}

}