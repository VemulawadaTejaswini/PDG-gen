import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int t=0;t<T;t++){
			long A = sc.nextLong();
			long B = sc.nextLong();
			long C = sc.nextLong();
			long D = sc.nextLong();
			if(A<B){ System.out.println("No"); continue; }
			if(B<=C+1 && B<=D){ System.out.println("Yes"); continue; }
			if(B<D){

				long v = (A%B) + ((D-B)* (long)Math.ceil((float)(C+1-(A%B))/2));

				if(v >= B) System.out.println("Yes");	
				else System.out.println("No");
				continue;
			}
			if(B==D){
				if(A%B <= C) System.out.println("Yes");
				else System.out.println("No");
				continue;}
			
			System.out.println("No");
		}
	}
}