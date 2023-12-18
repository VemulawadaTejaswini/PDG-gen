import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try(Scanner scan = new Scanner(new InputStreamReader(System.in))){
			int N = scan.nextInt();
			int M = scan.nextInt();
			
			int[] box = new int[N+1];
			Arrays.fill(box, 1);
			box[0] = 0;

			boolean[] red = new boolean[N+1];
			red[1] = true;
			
			for(int i = 0; i < M; i++){
				int x = scan.nextInt();
				int y = scan.nextInt();
				
				box[x]--;
				box[y]++;
				
				if(red[x] == true){
					red[y] = true;
				}
				if(box[x] == 0){
					red[x] = false;
				}
			}
			
			int ans = 0;
			for(int i = 1; i <= N; i++){
				if(red[i] == true){
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
