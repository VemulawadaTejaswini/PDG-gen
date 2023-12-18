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

		String str = br.readLine();
		
		int n = Integer.parseInt(str);
		
		int lowestRank = 0;
		int lowestScore = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++){
			String[] tmpArray = br.readLine().split(" ");
			int rank = Integer.parseInt(tmpArray[0]);
			int score = Integer.parseInt(tmpArray[1]);
			
			if(lowestRank < rank){
				lowestRank = rank;
				lowestScore = score;
			}
		}
		
		int result = lowestRank + lowestScore;
		System.out.println(result);
	}

}
