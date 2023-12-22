import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			if(H == 0 && W == 0){
				break;
			}

			for ( int i = 0; i < H; i++ ){
				for ( int j = 0; j < W; j++ ){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}

