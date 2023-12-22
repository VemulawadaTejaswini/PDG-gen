import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		int N = Integer.parseInt(line);
		for( int i = 1; i <= N; i++){
			if(i % 3 == 0 || i % 10 == 3){
				//最初にスペースを入れない
				if(i > 3){
					System.out.print(" ");
				}

				System.out.print(i);

			}
		}
		System.out.printf("\n");
	}

}