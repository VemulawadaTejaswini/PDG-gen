import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str,strArray[];


		while(!(str=br.readLine()).equals("0 0 0")){
			strArray=str.split(" ");
			int rel[] = new int[3];


			for(int i=0; i<3; i++){
				rel[i] = Integer.parseInt(strArray[i]);
			}

			int n = Integer.parseInt(br.readLine());
			boolean judges[] = new boolean[n];

			for(int i=0; i<n; i++){
				int r = 2*Integer.parseInt(br.readLine());
				if((r>rel[0] && r>rel[1]) || (r>rel[1] && r>rel[2]) ||(r>rel[2] && r>rel[0])){
					judges[i]=true;
				}
			}

			for(int i=0; i<n; i++){
				System.out.println(judges[i] ? "OK" : "NA");
			}

		}

	}
}