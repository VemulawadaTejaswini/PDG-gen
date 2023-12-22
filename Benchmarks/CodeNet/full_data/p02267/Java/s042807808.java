import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int N = Integer.parseInt(br.readLine());
			String[] S = new String[N];
			int[] Sarray = new int[N];

			 S= br.readLine().split("\\s+");
			for(int x = 0; x < N; x++){
				Sarray[x] = Integer.parseInt(S[x]);
			}

			int Q = Integer.parseInt(br.readLine());
			String[] T = new String[Q];
			int temp = 0;
			int answer = 0;

			T = br.readLine().split("\\s+");
			for(int y = 0; y < Q; y++){
				temp = Integer.parseInt(T[y]);
				for(int k = 0; k < N; k++){
					if(temp == Sarray[k]){
						answer++;
						break;
					}
				}
			}

			System.out.println(answer);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

