import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		int y = cin.nextInt();
		s.add(y);
		while(!s.isEmpty()){
			int x = cin.nextInt();
			if(x==0){
				System.out.println(s.pop());
			}
			else{
				s.add(x);
			}
		}
	}

}