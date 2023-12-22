import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringJoiner;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		boolean flag = false;
		int counter = 0;
		do{
			flag = false;
			for(int i = n - 1; 1 <= i; i--){
				if(array[i] < array[i-1]){
					int v = array[i-1];
					array[i-1] = array[i];
					array[i] = v;
					flag = true;
					counter++;
				}
			}
		}while(flag);
		
		StringJoiner sj = new StringJoiner(" ");
		Arrays.stream(array).forEach(i -> sj.add(String.valueOf(i)));
		System.out.println(sj);
		System.out.println(counter);
	}
}

