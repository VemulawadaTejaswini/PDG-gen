import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		List<Integer> wordLength = new ArrayList<Integer>();
		while(stdIn.hasNext()){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = a + b;
			wordLength.add(Integer.toString(c).length());
		}
		for(int i:wordLength){
			System.out.println(i);
		}
	}
}