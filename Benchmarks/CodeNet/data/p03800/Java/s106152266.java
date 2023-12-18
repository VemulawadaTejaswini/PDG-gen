import java.util.Scanner;
 
public class Main { 
	final static boolean S = true;
	final static boolean W = false;

	public static void main(String[] args){
		try(Scanner scan = new Scanner(System.in)){
			int N = scan.nextInt();
			scan.nextLine();
			String s = scan.nextLine();
			
			boolean[] ans = new boolean[N+1];
			boolean[][] init = {{S, S}, {S, W}, {W, S}, {W, W}}; 
			
			for(int i = 0; i<4; i++){
				ans[0] = init[i][0];
				ans[1] = init[i][1];
				
				for(int j = 2; j<N; j++){
					boolean a = true;
					if(s.charAt(j) == 'x'){
						a = false;
					}
					
					boolean hanten = a ^ ans[j];
					if(hanten){
						ans[j+1] = !ans[j-1];
					}else{
						ans[j+1] = ans[j-1];
					}
				}
				
				if(ans[0] == ans[N]){
					for(int j = 0; j<N; j++){
						String c = ans[j] ? "S" : "W";
						System.out.print(c);
						return;
					}
					System.out.println();
				}
				
			}
			
			System.out.println(-1);
		}
	}
}
