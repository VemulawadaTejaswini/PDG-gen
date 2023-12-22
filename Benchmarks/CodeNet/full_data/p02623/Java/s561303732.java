import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		long k = stdIn.nextLong();

		long[] a = new long[n];

		long[] b = new long[m];

		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextLong();
		}

		for(int i = 0; i < m; i++) {
			b[i] = stdIn.nextLong();
		}
		
		
		int indexa = 0;
		
		int indexb = 0;
		
		boolean flaga = false;
		boolean flagb = false;
		
		long time = 0;
		long cnt = 0;
		
		for(int i = 0; i < n+m ; i++) {
			//終了条件を明確に！
			/*			if(flaga && b[indexb] + time > k)break;
						
						if(flagb && a[indexa] + time > k)break;*/
			
			boolean check = false;
			
			if(a[indexa] <= b[indexb] && a[indexa] + time <= k) {
				time += a[indexa];
				indexa++;
				cnt++;
				check = true;
				
				if(indexa == n) {
					flaga = true;
					break;
				}
							
			}
			
			if(b[indexb] <= a[indexa] && b[indexb] + time <= k) {
				time += b[indexb];
				indexb++;
				cnt++;
				check = true;
				
				if(indexb == m) {
					flagb = true;
					break;
				}
				
				
			}
			
			if(!check) {
				System.out.println(cnt);
				return;
			}
			

			
		}
		
		if(flaga) {
			for(int i = indexb; i < m; i++) {
				if(b[indexb] + time <= k) {
					time += b[indexb];
					indexb++;
					cnt++;
					if(indexb == m) {
						System.out.println(cnt);
						return;
					}
				}else {
					System.out.println(cnt);
					return;
				}
			}
		}
		if(flagb) {
			for(int i = indexa; i < n; i++) {
				if(a[indexa] + time <= k) {
					time += a[indexa];
					indexa++;
					cnt++;
					if(indexa == n) {
						System.out.println(cnt);
						return;
					}
				}else {
					System.out.println(cnt);
					return;
				}
			}
		}
		
	
		
		
		
	}

}
