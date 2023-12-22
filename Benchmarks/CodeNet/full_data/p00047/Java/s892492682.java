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
		
		Manager manager = new Manager();
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] strArray = str.split(",");
			
			manager.swap(strArray[0], strArray[1]);
		}
		
		System.out.println(manager.currentBallPos());

	}

}

class Manager {
	int ballPos = 0;
	
	public void swap(String s1, String s2){
		int index1 = strToIndex(s1);
		int index2 = strToIndex(s2);
		
		if(index1 == ballPos){
			ballPos = index2;
		}
		else if(index2 == ballPos){
			ballPos = index1;
		}
	}
	
	public char currentBallPos(){
		
		char result;
		switch (ballPos){
		case 0:
			result = 'A';
			break;
		case 1:
			result = 'B';
			break;
		case 2:
			result = 'C';
			break;
		default:
			result = 'F';
		}
		
		return result;
	}
	
	private int strToIndex(String str){
		if(str.equals("A")){
			return 0;
		}
		else if (str.equals("B")){
			return 1;
		}
		else {
			return 2;
		}
	}
}