import java.io.File;
import java.io.IOException;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
			
		int ans = 0;
		
		if(N == 10000) ans += 10000;
		
		for(int i = 1; i <= 9; i++){
			if(i >= A && i <= B){
				ans += i;
				//System.out.println(i);
			}
			
			for(int j = 0; j <= 9; j++){
				int ij = 10 * i + j;
				if(ij > N) continue;
				if(i + j > B) continue;
				if(i + j >= A && i + j <= B){
					ans += ij;
					//System.out.println(ij);
				}
				
				for(int k = 0; k <= 9; k++){
					int ijk = 100 * i + 10 * j + k;
					if(ijk > N) continue;
					if(i + j + k > B) continue;
					if(i + j + k >= A && i + j + k <= B){
						ans += ijk;
						//System.out.println(ijk);
					}
					
					for(int m = 0; m <= 9; m++){
						int ijkm = 1000 * i + 100 * j + 10 * k + m;
						if(ijkm > N) continue;
						if(i + j + k + m >= A && i + j + k + m <= B){
							ans += ijkm;
							//System.out.println(ijkm);
						}
					}
				}
			}
		}
		
		System.out.println(ans);
	}
}