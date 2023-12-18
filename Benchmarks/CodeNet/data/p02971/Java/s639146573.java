import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 0 ; i< N ; i++) {
			
			a.add(sc.nextInt());
			
		}
		
		
		
		
		for(int i = 0 ; i< N ; i++) {
			int max = 0; 
			for(int j = 0 ; j < N ; j++) {
				
				if(i == j) {
					continue;
				}
				
				if(max < a.get(j)) {
					max = a.get(j);
				}
				
				
			}
			
			System.out.println(max);
			
		}
	}

}