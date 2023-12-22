import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
	public static void main(String[] args) throws IOException{ 
		
		ArrayList<String> spadeList = new ArrayList<String>(Arrays.asList("1", "2", "3","4","5","6","7","8","9","10","11","12","13"));
		ArrayList<String> hartList = new ArrayList<String>(Arrays.asList("1", "2", "3","4","5","6","7","8","9","10","11","12","13"));
		ArrayList<String> clabList = new ArrayList<String>(Arrays.asList("1", "2", "3","4","5","6","7","8","9","10","11","12","13"));
		ArrayList<String> diamondList = new ArrayList<String>(Arrays.asList("1", "2", "3","4","5","6","7","8","9","10","11","12","13"));
		

		//?????£??????????????????????????°?????\???
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String strCards = br.readLine();
		int cardNum = Integer.parseInt(strCards);
		
		//?????£??????????????????????¨?????????\??? 
		
		for(int i=0 ; i<cardNum; i++){
			BufferedReader br2 =
					new BufferedReader(new InputStreamReader(System.in));
			
			String[] cardType = br2.readLine().split(" ");
			
			if(cardType[0].equals("S")) {
				spadeList.remove(cardType[1]);
			}
			else if(cardType[0].equals("H")) {
				hartList.remove(cardType[1]);
			}
			else if(cardType[0].equals("C")) {
				clabList.remove(cardType[1]);
			}
			else if(cardType[0].equals("D")) {
				diamondList.remove(cardType[1]);
			}
		}
		for (int i = 0 ; i < spadeList.size() ; i++){
		      String allCard = spadeList.get(i);
		      System.out.println("S " + allCard);
		    }
		for (int i = 0 ; i < hartList.size() ; i++){
		      String allCard = hartList.get(i);
		      System.out.println("H " + allCard);
		    }
		for (int i = 0 ; i < clabList.size() ; i++){
		      String allCard = clabList.get(i);
		      System.out.println("C " + allCard);
		    }
		for (int i = 0 ; i < diamondList.size() ; i++){
		      String allCard = diamondList.get(i);
		      System.out.println("D " + allCard);
		    }
	}
}