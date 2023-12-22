
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] seq = new int[w];
		for(int i = 0; i < seq.length;i++){
			seq[i] = i+1;
		}
		for(int i = 0 ; i < n;i++){
			String[] s= br.readLine().split(",");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			int c = seq[a-1];
			seq[a-1] = seq[b-1];
			seq[b-1] = c;
		}
		for(int i = 0; i<seq.length;i++){
			System.out.println(seq[i]);
		}
	}

}