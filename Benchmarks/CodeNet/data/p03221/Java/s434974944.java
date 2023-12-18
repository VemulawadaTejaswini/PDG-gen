import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;
	public final static String ONE_PLUS = "+one";
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int count = 2;
		for(int i = 0; i < N; i++){
			String line = br.readLine();
			if(line.contains(ONE_PLUS)){
				count += 2;
			}else{
				count++;
			}
		}
		if(count == 13){
			count++;
		}
		System.out.print(count*100);
	}

}