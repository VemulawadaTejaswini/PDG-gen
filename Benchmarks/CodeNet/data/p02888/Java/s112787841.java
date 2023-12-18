import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) { //にぶたんを使わないでまずは解いてみる
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] l = new int[n];
		
		for(int i = 0; i < n; i++) {
			l[i] = stdIn.nextInt();
		}
		
		Arrays.sort(l);
		
		long cnt = 0;
		
		
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n-1; j++) {
				
				if(l[i]+l[j] > l[j+1]) {
					
					for(int k = j+1; k < n; k++) {
						if(l[i]+l[j] > l[k]) {
							cnt++;
						}
					}
					
				}
				
			}
			
		}
		System.out.println(cnt);
		
		
		
	}

}
