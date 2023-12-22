import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] height = new int[10];
		
		for (int i = 0; i < 10; i++){
			String s = br.readLine();
			height[i] = Integer.parseInt(s);
		}
		
		Arrays.sort(height);
		
		System.out.println(height[height.length-1]);
		System.out.println(height[height.length-2]);
		System.out.println(height[height.length-3]);
	}
}