import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		int ans = 0;
		while(true){
			boolean tf = true;
			for(int i = 0; i < N; i++) if(A[i] % 2 != 0) tf = false;
			if(!tf) break;
			ans++;
			for(int i = 0; i < N; i++) A[i] /= 2;
		}
		
		System.out.println(ans);
	}
}