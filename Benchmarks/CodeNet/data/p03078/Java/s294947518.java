
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class Main {

	public static class Cake{
		public int a;
		public int b;
		public int c;
		public Cake(int a, int b, int c){
			this.a = a;
			this.b = b;
			this.c = c;
		}
		
	    @Override
	    public int hashCode() {
	        int result = 1;
	        return result;
	    }
		
		@Override
		public boolean equals(Object obj){
			if (this == obj)
				return true;
		    if (obj == null)
		    	return false;
		    if (getClass() != obj.getClass())
		    	return false;
		    Cake cake = (Cake)obj;
			if(this.a == cake.a && this.b == cake.b && this.c == cake.c){
				return true;
			}else{
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		int Z = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		
		Long[] A = new Long[X];
		Long[] B = new Long[Y];
		Long[] C = new Long[Z];

		for(int i=0; i<X; i++){
			A[i] = Long.parseLong(sc.next());
		}
		for(int i=0; i<Y; i++){
			B[i] = Long.parseLong(sc.next());
		}
		for(int i=0; i<Z; i++){
			C[i] = Long.parseLong(sc.next());
		}
		Arrays.sort(A, Collections.reverseOrder());
		Arrays.sort(B, Collections.reverseOrder());
		Arrays.sort(C, Collections.reverseOrder());
		
		ArrayList<Cake> cakes = new ArrayList<>();
		cakes.add(new Cake(0,0,0));
		HashSet<Cake> selected_cakses = new HashSet<>();
		
		Cake cake1 = new Cake(0,2,5);
		Cake cake2 = new Cake(0,2,4);
		System.out.println(cake1.equals(cake2));
		
		while(K>0){
			long max = 0;
			int max_i = 0;
			for(int i=0; i< cakes.size(); i++){
				Cake cake = cakes.get(i);
				int ite_A = cake.a;
				int ite_B = cake.b;
				int ite_C = cake.c;
				
				long tmp_max = A[ite_A] + B[ite_B] + C[ite_C];
				if(tmp_max > max){
					max = tmp_max;
					max_i = i;
				}
			}
			Cake cake = cakes.get(max_i);
			int ite_A = cake.a;
			int ite_B = cake.b;
			int ite_C = cake.c;
			System.out.println(A[ite_A] + B[ite_B] + C[ite_C]);
			K--;
			
			selected_cakses.add(cake);
			cakes.remove(max_i);
			if(ite_A < X-1){
				Cake newcake = new Cake(ite_A+1,ite_B,ite_C);
				if(!selected_cakses.contains(newcake)){
					cakes.add(newcake);
				}else{
					System.out.println("あああ");
				}
			}
			if(ite_B < Y-1){
				Cake newcake = new Cake(ite_A,ite_B+1,ite_C);
				if(!selected_cakses.contains(newcake))
				cakes.add(newcake);
			}
			if(ite_C < Z-1){
				Cake newcake = new Cake(ite_A,ite_B,ite_C+1);
				if(!selected_cakses.contains(newcake))
				cakes.add(newcake);
			}
			
			//System.out.println(selected_cakses.size());
		}
		
		
		/*
		int ite_A = 0;
		int ite_B = 0;
		int ite_C = 0;
		System.out.println(A[ite_A] + B[ite_B] + C[ite_C]);
		K--;
		while(K > 0){
			long min = Long.MAX_VALUE;
			long diff_A = Long.MAX_VALUE;
			if(ite_A<X-1)diff_A = A[ite_A] - A[ite_A+1];
			long diff_B = Long.MAX_VALUE;
			if(ite_B<Y-1)diff_B = B[ite_B] - B[ite_B+1];
			long diff_C = Long.MAX_VALUE;
			if(ite_C<Z-1)diff_C = C[ite_C] - C[ite_C+1];
			
			if(diff_A <= diff_B && diff_A <= diff_C){
				ite_A++;
			}else if(diff_B <= diff_A && diff_B <= diff_C){
				ite_B++;
			}else{
				ite_C++;
			}
			
			System.out.println(A[ite_A] + B[ite_B] + C[ite_C]);
			K--;
		}
		*/

		sc.close();
	}
	
}
