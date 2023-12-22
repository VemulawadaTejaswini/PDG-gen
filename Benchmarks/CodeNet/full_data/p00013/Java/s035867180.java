
import java.util.Scanner;
import java.util.*;

public class Main{
	
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	Stack<Integer> moveSeq = new Stack<Integer>();
	while(scan.hasNext()){
		
		int i = scan.nextInt();
		if(i == 0){
			System.out.println(moveSeq.pop());
				
			} else {
				moveSeq.push(i);
		}
	}
	

	
}

}

