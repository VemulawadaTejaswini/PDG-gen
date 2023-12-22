import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int n = sc.nextInt();
			int r = sc.nextInt();
			
			if((n|r) ==0) {
				break;
			}
			
			
			int[] z = new int[n];
			for(int i = 0; i < n ; i++){
				z[i] = n - i;
			}
			
			for(int i = 0; i < r ; i++){
				int p = sc.nextInt() - 1;
				int c = sc.nextInt();
				
				int[] z2 = z.clone();
				
				for(int j = 0 ; j < c ; j++){
					z2[j] = z[j+p];
				}
				for(int j = 0; j < p ; j ++){
					z2[j+c] = z[j];
				}
				z = z2;
//				System.out.println(Arrays.toString(z));
			}
			System.out.println(z[0]);
		}
		
	}
	public static void main(String[] args){
		Main m = new Main();
		m.run();
	}
}