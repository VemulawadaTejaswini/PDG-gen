import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextInt();
		int counter=0;
		ArrayList sosus = new ArrayList();

		for(int i=2; i<=N; i++) {
			while(N%i == 0 ) {
				sosus.add(i);
				N = N/i;
			}
		}
		
		int num=1;
		for(int i=0; i<sosus.size()-1; i++) {
			if(sosus.get(i) == sosus.get(i+1)) {
				num++;
				if(i== sosus.size()-2) {
					for(int k=1; num>0; k++) {
						counter++;
						num = num-k-1;
						
					}
					
				}
			}
			else {
				for(int k=1; num>0; k++) {
					counter++;
					num = num-k;
					
				}
				num =1;
				
			}
		
			
		}

		for(int i=0; i<sosus.size(); i++) {
			System.out.print(sosus.get(i));
		}


		System.out.println(counter);

	}

}
