import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static BufferedReader reader;
	
	public static void main(String[] args){
		reader = new BufferedReader(new InputStreamReader(System.in));
		String[] argA = readLine().split(" ");
		if(argA.length<2){return;}
		try{
			int N = Integer.parseInt(argA[0]);
			int M = Integer.parseInt(argA[1]);
			String[] argB = readLine().split(" ");
			if(argB.length!=M){return;}
			int[] X = new int[M];
			for(int i=0;i<M;i++){
				X[i]=Integer.parseInt(argB[i]);
			}
			
			if(M<N){System.out.print(0);return;}
			
			Arrays.sort(X);
			int[] L = new int[M-1];
			for(int i=0;i<M-1;i++){
				L[i] = X[i+1]-X[i];
				//System.out.println(L[i]);
			}
			Arrays.sort(L);
			int ans = 0;
			for(int k=0;k<M-N;k++){
				ans+=L[k];
			}
			System.out.print(ans);return;
		}catch(Exception e){
			e.printStackTrace();
		}
		return;
	}

	private static String readLine(){
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			return reader.readLine();
		}catch(Exception e){
			return e.getMessage();
		}
	}
}