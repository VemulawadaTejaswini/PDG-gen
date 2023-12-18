import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int []h = new int[N];
			int hmax = 0;
			
			for(int i = 0;i<N;i++) {
				h[i] = scan.nextInt();
				if(hmax<h[i]) hmax = h[i];
			}
			int count = 0;
			while(true) {
			
			boolean katamari = false;
			
			
				for(int i = 0;i<N;i++) {
					
					if(h[i]!=0) katamari = true;
					
					if(katamari==true&&(h[i]==0||i==N-1)){
						count++;
						katamari = false;
					}
					
					if(h[i]!=0)h[i]--;
				}
				
				int zerocount = 0;
				for(int i = 0;i<N;i++) {
					if(h[i]==0)zerocount++;
					//System.out.print(h[i]);
					//System.out.print(" ");
					
				}
				//System.out.println();
				
				if(zerocount==N)break;
			}
			
			System.out.println(count);
			
			
		}
		
		
	}
		

}
