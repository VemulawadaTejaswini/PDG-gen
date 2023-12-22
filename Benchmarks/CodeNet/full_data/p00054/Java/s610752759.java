import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	
	private static int a, b, n;
	private static char[] f;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=br.readLine()) != null){
			String[] arrays = line.split(" ");
			a = Integer.parseInt(arrays[0]);
			b = Integer.parseInt(arrays[1]);
			n = Integer.parseInt(arrays[2]);
			f = (String.valueOf((double)a/b).split("\\."))[1].toCharArray();
			
			int sum = 0;
			for(int i=0;i<n && i<f.length;i++){
				sum = sum + (int)(f[i]-'0');
			}
			System.out.println(sum);
		}

	}
}