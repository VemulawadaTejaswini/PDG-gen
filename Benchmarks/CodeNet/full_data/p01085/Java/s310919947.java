import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int m = Integer.parseInt(tmpArray[0]);
			int nmin = Integer.parseInt(tmpArray[1]);
			int nmax = Integer.parseInt(tmpArray[2]);
			
			if(m == 0 && nmax == 0 && nmin == 0){
				break;
			}
			
			int score[] = new int[m];
			
			for(int i = 0 ; i < m; i++){
				score[i] = Integer.parseInt(br.readLine());
			}
			
			int gap = -1;
			int pass = 0;
			
			for(int i = nmin - 1 ; i < nmax ; i++){
				if(score[i] - score[i + 1] >= gap){
					gap = score[i] - score[i + 1];
					pass = i + 1;
//					System.out.println("gap "+gap+" pass "+pass);
				}
			}
			
			System.out.println(pass);
		}
	}

}