import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] a = new int[N];
		int[] b = new int[N];
		
		for(int i=0;i<N;i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
			
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++){
			for(int j=0;j<b[i];j++){
				array.add(a[i]);
			}
		}

		Collections.sort(array);
		System.out.println(array.get(K-1));

	}
}


