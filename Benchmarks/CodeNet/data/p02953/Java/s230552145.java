import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			int[]H = new int[N];
			
			for(int i =0;i<N;i++) {
				H[i] = scan.nextInt();
			}
			
			int[]nH = new int[N];
			for(int i =0;i<N;i++) {
				nH[i] = H[i];
			}
			
			Arrays.sort(nH);
			
			String S = "Yes";
			if(N==1) {
				System.out.println("Yes");	
			}else if(N==2) {
				if(H[1]<H[0]) {
					H[1]--;
				}
				if(H[1]>=H[0]) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}		
			}else {
				
				for(int i = 1;i<=N-2;i++) {
					if(H[i]>H[i+1]&&H[i]>H[i-1]) {
						H[i]--;
						
						if(H[i]>H[i+1]) {
							S = "No";
							break;
							}	
						}
					}
			
			
			
			
			for(int i=0;i<N;i++) {
				if(H[i]!=nH[i]) {
					S="No";
				}
				
				//System.out.print(H[i]);
				//System.out.print("  ");
				//System.out.print(nH[i]);
				//System.out.println();
			}
			
			
			
			
			
			System.out.println(S);
		
			
			
			}
			
			
		}
		
		
	}
		

}
