import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int n;
	static int []S;
	static int q;
	static int t;
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String [] temp = br.readLine().split(" ");
		S = new int[n];
		for(int i=0;i < n;i++){
			S[i] = Integer.parseInt(temp[i]);
		}

		q =Integer.parseInt(br.readLine());
		temp = br.readLine().split(" ");

		for(int i = 0;i < q;i++){
			t = Integer.parseInt(temp[i]);
			search(t);
		}

		System.out.println(count);

	}

	public static void search(int num){
		for(int i = 0;i < n;i++){
			if(S[i] == num){
				count++;
				return;
			}
		}
	}

}