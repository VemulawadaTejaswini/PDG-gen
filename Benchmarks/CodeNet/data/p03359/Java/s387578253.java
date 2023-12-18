import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q096 {

	public static void main(String[] args) throws IOException {
		method1();
	}
	
	public static String method1() throws IOException{
		System.out.println("Input: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String[] wh = str.split(" ");
		
		int w = Integer.parseInt(wh[0]);
		int h = Integer.parseInt(wh[1]);
		
		System.out.print("\n");
		
		String[][] aaa = new String[w][h];
		
		for(int i = 0; i < h; i++){
			aaa[i] = br.readLine().split(",");
			
			for(String s: aaa[i]) System.out.print(s);
			
			System.out.print("\n");
		}
		
		return "yes";
	}
}
