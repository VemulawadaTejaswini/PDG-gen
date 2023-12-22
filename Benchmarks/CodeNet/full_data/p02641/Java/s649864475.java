import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int N = s.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++) {
			p[i] = s.nextInt();
		}
		Arrays.sort(p); //昇順にソート
		int i_X =-1; //p[i] = X を満たす整数i
		boolean existX = false;
		for(int i =0; i<N; i++) {
			if(p[i] == X ) {existX = true; i_X = i; break;}
		}

		int ans=0;
		int sumP =0;
		for(int i=0; i<N; i++) {
			sumP += p[i];
		}
		
		if(!existX) {ans = X; }
		else if(sumP == (N*(p[N-1]+p[0]))/2 ) { 
			if(X-p[0] <= p[N-1]-X) {ans = p[0]-1;}
			else {ans = p[N-1]+1;}
		}
		else { boolean da = false;
			for(int k=1; k<=i_X && k<=N-1-i_X; k++ ) {

				  if(p[i_X-k] !=  p[i_X]-k) {ans =p[i_X]-k;  da = true; break;}
				  else if(p[i_X+k] !=  p[i_X]+k) {ans =p[i_X]+k; da = true; break;}
				}
			if(!da) {
				if(X-p[0] <= p[N-1]-X) {ans = 9;}
					else {ans = 9; }	
				
			}
		
		}
		
		System.out.println(ans);
	}

}