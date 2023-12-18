import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long k = Long.parseLong(br.readLine());
		
//		for(int i = 1; i <= 250; i++){
//			System.out.printf("i = %2d S(%2d) = %3d sunuke = %f \n",i, i, calcS(i), (double)i/calcS(i));
//		}
		
		//すぬけ数の理論上の最小値は1
		long i = 1;
//		long add = 1;
		long j = 0;
		long count = 0;
		while(count < k){
			System.out.print(i);
			for(int l = 0; l < j; l++){
				System.out.print(9);
			}
			i++;
			if(i == 10){
				i = 1;
				j++;
			}
			System.out.println();
//			System.out.println(i);
//			i += add;
			count++;
//			if(count % 9 == 0){
//				add *= 10;
//			}
		}
		
	}
	
	static int calcS(int n){
		int result = 0;
		
		while(n > 0){
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
	
}