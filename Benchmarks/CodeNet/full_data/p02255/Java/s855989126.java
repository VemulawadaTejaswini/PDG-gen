import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		trace(array);
		
		for(int i = 1; i < n; i++){
			int v = array[i];
			int j = i - 1;
			
			while(j >= 0 && array[j] > v){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = v;javascript:void(0)
			
			trace(array);
		}
		
		System.out.println();
	}
	
	public static void trace(int[] array){
		StringJoiner sj = new StringJoiner(" ");
		Arrays.stream(array).forEach(iv -> sj.add(String.valueOf(iv)));
		System.out.println(sj.toString());
	}
}

