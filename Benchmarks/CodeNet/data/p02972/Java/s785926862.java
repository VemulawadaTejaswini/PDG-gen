import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int M = 0;
		int N = sc.nextInt();
		int check = 0;
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		
		for(int i = 0 ; i< N ; i++) {
			
			a.add(sc.nextInt());
			
		}


		for(int i = 0; i < N; i++) {
			
			int sum = 0;
			
			for(int j = i+1; j <= N; j++) {
			
				if(j%(i+1) == 0) {
					sum+= a.get(i);
				}
				
			}
			
			if(sum%2 == a.get(i)) {
				check++;
				if(a.get(i)==1) {
					M++;
					b.add(i+1);
				}
				
			}
			
			
		}
		
		if(N == check) {
			if(M==0) {
				System.out.println(M);
			}else {
				System.out.println(M);
				for(int i= 0; i < b.size(); i++) {
					System.out.print(b.get(i));
				}

			}
			
		}else {
			System.out.println(-1);
		}


	}

}