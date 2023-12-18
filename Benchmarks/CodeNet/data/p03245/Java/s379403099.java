import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] X = new int[n];
		int[] Y = new int[n];
		
		int odev = 0;
		int max = 0;
		for(int i = 0 ; i < n ; i++){
			String[] strs = br.readLine().split(" ");
			X[i] = Integer.parseInt(strs[0]);
			Y[i] = Integer.parseInt(strs[1]);
			if( Math.abs(X[i] + Y[i]) % 2 == 1 ){
				if(odev == -1){
					System.out.println("-1");
					return;
				}
				odev = 1;
			}else{
				if(odev == 1){
					System.out.println("-1");
					return;
				}
				odev = -1;
			}
			
			if(max < Math.abs(X[i]) + Math.abs(Y[i])){
				max = Math.abs(X[i]) + Math.abs(Y[i]);
			}
		}
		
		System.out.println(max);
		for(int i = 0 ; i < max ; i++){
			System.out.print("1");
			System.out.print((i == max-1) ? '\n' :" ");
		}
		for(int i = 0 ; i < n ; i++){
			int x = Math.abs(X[i]);
			for(int j = 0 ; j < x ; j++){
				System.out.print( ((X[i] > 0) ? "R" : "L")  );
			}
			int y = Math.abs(Y[i]);
			for(int j = 0 ; j < y ; j++){
				System.out.print( ((Y[i] > 0) ? "U" : "D")  );
			}
			for(int j = x+y ; j < max ; j++){
				System.out.print( ((j%2 == 0) ? "U" : "D")  );
			}
			
			System.out.println();
		}
		
	}
}
