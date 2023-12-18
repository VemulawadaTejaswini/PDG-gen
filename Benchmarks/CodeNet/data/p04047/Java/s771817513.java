import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] L2 = new Integer[2*N];
		String[] L = br.readLine().split(" ");
		for(int i=0;i<L.length;i++){
			L2[i] = Integer.parseInt(L[i]);
		}
		
		int sum = 0;
		Arrays.sort(L2);
		for(int i=L2.length-1;i>0;i-=2){
			sum += Math.min(L2[i], L2[i-1]);
		}
		
		System.out.println(sum);
	}
}
