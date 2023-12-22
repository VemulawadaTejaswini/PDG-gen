import java.util.Stack;
import java.util.Scanner;

public class aoj0013 {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack data = new Stack();
		while(s.hasNext()){
			int in = s.nextInt();
			if(in != 0)
				data.push(in);
			else
				System.out.println(data.pop());
		}
    }
}