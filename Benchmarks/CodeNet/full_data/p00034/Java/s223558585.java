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
			String tmp = br.readLine();
			
			if(tmp == null){
				break;
			}
			
			String[] tmpArray = tmp.split(",");
			
			int[] distance = new int[10];
			int sum = 0;
			for(int i = 0; i < 10 ; i++){
				distance[i] = Integer.parseInt(tmpArray[i]);
				sum += distance[i];
			}
			int v1 = Integer.parseInt(tmpArray[10]);
			int v2 = Integer.parseInt(tmpArray[11]);
			
			double conflictPoint = (double)sum*v1/(v1+v2);
			
			for(int i = 0; i < 10 ; i++){
				conflictPoint -= distance[i];
				if(conflictPoint <= 0){
					System.out.println(i + 1);
					break;
				}
			}
		}
	}

}