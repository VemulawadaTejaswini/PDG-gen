import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();

		
        for (int i = 0; i < N; i++) {
            int d = sc.nextInt();
			arr.add(d);
            }
			int N2 = 0;
			
			for (Integer integer : arr){
				N2 ^= integer;				
				}
				List<Integer> arr2 = new ArrayList<>();
				
				for (Integer integer : arr){
				System.out.print((integer^N2) +" ");				
				}
			
			
		}
}