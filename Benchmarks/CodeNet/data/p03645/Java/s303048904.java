import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] tmpArray = br.readLine().split(" ");
		int numOfIsland = Integer.parseInt(tmpArray[0]);
		int numOfShip = Integer.parseInt(tmpArray[1]);
		
		ArrayList<Integer> shipFrom1 = new ArrayList<Integer>();
		ArrayList<Integer> shipToN = new ArrayList<Integer>();
		
		boolean result = false;
		
		for(int i = 0; i < numOfShip ; i++){
			tmpArray = br.readLine().split(" ");
			int a = Integer.parseInt(tmpArray[0]);
			int b = Integer.parseInt(tmpArray[1]);
			
			if(a == 1){
				shipFrom1.add(b);
			}
			
			else if(b == numOfIsland){
				shipToN.add(a);
			}
		}
		
		if(shipFrom1.size() <= shipToN.size()){
			for(int i = 0; i < shipFrom1.size() ; i++){
				if(shipToN.contains(shipFrom1.get(i))){
					result = true;
					break;
				}
			}
		}
		else {
			for(int i = 0; i < shipToN.size() ; i++){
				if(shipFrom1.contains(shipToN.get(i))){
					result = true;
					break;
				}
			}
		}
		
		if(result){
			System.out.println("POSSIBLE");
		}
		else {
			System.out.println("IMPOSSIBLE");
		}
	}

}
