import java.util.Scanner;
import java.util.Stack;

public class AOJ0013 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Stack<Integer> b = new Stack<Integer>();
		while(a.hasNext()){
			int c = a.nextInt();
			if(c==0){
				System.out.println(b.pop());
			}
			else{
				b.push(c);
			}
		}
	}
}