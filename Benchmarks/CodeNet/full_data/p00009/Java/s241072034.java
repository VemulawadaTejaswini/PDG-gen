import java.io.*;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] argv) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			int n = Integer.parseInt(line);
			int num = 0;
			int[] array = new int[n+1];
			Arrays.fill(array, 1);
			for(int i=2; i<(int)(n/2+1); i++){
				for(int j=2; i*j<=n; j++){
					array[i*j] = 0;
				}
			}
			for(int i=2; i<=n; i++){
				if(array[i] == 1)num++;
			}
			System.out.print(Integer.toString(num)+"\n");
		}
	}
}