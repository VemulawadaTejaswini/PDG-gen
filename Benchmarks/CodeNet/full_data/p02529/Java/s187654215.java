import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String sArray[],tArray[];
		int count=0;

		int n = Integer.parseInt(br.readLine());
		sArray = br.readLine().split(" ");

		int q = Integer.parseInt(br.readLine());
		tArray = br.readLine().split(" ");

		for(int i=0; i<q; i++){
			for(int j=0; j<n; j++){
				if(tArray[i].equals(sArray[j]))
					count++;
			}
		}

		System.out.println(count);

	}
}