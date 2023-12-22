import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			int N = scan.nextInt();
			int[]p = new int[N];
			Set<Integer>set = new TreeSet<Integer>();
			for(int i = 0;i<N;i++) {
				p[i] = scan.nextInt();
				set.add(p[i]);
			}
			
			if(N==0) {
				System.out.println(X);
				System.exit(0);
			}
			
			int i =0;
			int ans = 0;
			while(true) {
				
				int S = X-i;
				if(!set.contains(S)) {//含まれてないなら答え
					ans = S;
					break;
				
					
				}
				
				int D = X+i;
				if(!set.contains(D)) {//含まれてないなら答え
					ans=D;
					break;
				}
				
				i++;
				

			}
			
			System.out.println(ans);
			
			
			
			
			
			
			
			
			
		}
		
		
	}
		

	
}
