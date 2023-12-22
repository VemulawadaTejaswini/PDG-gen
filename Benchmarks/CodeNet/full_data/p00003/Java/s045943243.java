import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	
	private static int N;
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++){
			int a, b, c;
			String line = br.readLine();
			String[] arrays = line.split(" ");
			
			a = (int)Math.pow(Integer.parseInt(arrays[0]),2);
			b = (int)Math.pow(Integer.parseInt(arrays[1]),2);
			c = (int)Math.pow(Integer.parseInt(arrays[2]),2);
			
			if(a+b==c || a+c==b || b+c==a){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}
}