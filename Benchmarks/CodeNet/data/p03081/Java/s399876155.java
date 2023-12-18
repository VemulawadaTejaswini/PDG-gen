import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] elements = sc.nextLine().split(" ");
		int boxNum = Integer.parseInt(elements[0]);
		int spellNum = Integer.parseInt(elements[1]);
		String[] charElements = sc.nextLine().split("");
		
		// initialize
		List<Data> boxList = new LinkedList<Data>();
		for( int i = 0; i < boxNum; i++ ) {
			boxList.add(new Data(charElements[i]) );
		}
		
		// operation
		for( int i = 0; i < spellNum; i++ ) {
			// input
			String[] spellElements = sc.nextLine().split(" ");
			String boxChar = spellElements[0];
			String moveDirection = spellElements[1];
			
			for( int j = 0; j < boxList.size(); j++ ) {
				Data targetBox = boxList.get(j);
				if( boxChar.equals(targetBox.boxChar) ) {
					if( moveDirection.equals("R") ) {
						if( j != boxList.size()-1 ) {
							boxList.get(j+1).golem += targetBox.golem;
						} 
						targetBox.golem = 0;
					} else {
						if( j != 0 ) {
							boxList.get(j-1).golem += targetBox.golem;
						} 
						targetBox.golem = 0;
					}
				}
			}
			
		}
		
		int result = 0;
		for( Data box : boxList) {
			result += box.golem;
		}
		System.out.println(result);
		sc.close();
	}
}
class Data {
	int golem = 1;
	final String boxChar;
	Data(String boxChar){
		this.boxChar = boxChar;
	}
	
}