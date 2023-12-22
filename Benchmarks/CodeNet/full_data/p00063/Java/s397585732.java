import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<String> wordList = new ArrayList<String>();
		while(stdIn.hasNext()){
			wordList.add(stdIn.next());
		}
		int simmetryCount = 0;
		for(String i:wordList){
//			boolean simmetryFlag = false;
			for(int j = 0;j < i.length(); j++){
				if(i.length() == 1 | (i.charAt(j) == i.charAt(i.length() -1 - j) && j > (i.length() - 1 - j))){
//					simmetryFlag = true;
					simmetryCount++;
					break;
				}
			}
		}
		System.out.println(simmetryCount);
	}
}