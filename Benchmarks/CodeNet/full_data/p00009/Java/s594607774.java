
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		while((line = br.readLine())!= null){
			int n = Integer.parseInt(line);
			int count = 0;
			int[] furui = new int[n+1];
			for(int i = 2 ; i < n/2+1;i++){
				for(int j = 0;j<n+1;j++){
					if(j!=i && j%i==0){
						furui[j] = -1;
					}
				}
			}
			
			for(int i = 2; i < n+1;i++){
				if(furui[i] == 0){
					count++;
				}
			}
			System.out.println(count);
		}

	}

}