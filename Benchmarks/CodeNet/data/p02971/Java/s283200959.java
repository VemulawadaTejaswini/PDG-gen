import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]A = new int[N];
			Integer[]B = new Integer[N];// ソート用
			
			
			for(int i = 0;i<N;i++) {
				A[i] = scan.nextInt();
				B[i] = A[i];
			}			
			Arrays.sort(B,Collections.reverseOrder());
			
			Set<Integer> sx = new LinkedHashSet<Integer>();
			for(int i =0;i<N;i++) {
				sx.add(B[i]);
			}
			Iterator<Integer> it = sx.iterator();
			
		
			
			int x = it.next();//ソートした最大値
			int dx;
			if(it.hasNext()) {
			    dx=it.next();
			}else {
				dx = x;
			}
			
			
			
			
			
			//System.out.println(x);
			//System.out.println(dx);
			//System.out.println();
			
			for(int i = 0;i<N;i++) {
				
				if(A[i]==x) {//A[i]が最大値より小さいならそれ取り除いても最大値は残る
					System.out.println(dx);
				}else{//Aが最大値ならそれよりワンランク下の値を表示する
					System.out.println(x);
					
				}
			}
			
		}
		
		
	}
		

}
