import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0){
				int out = stack.pop();
				System.out.println(out);
			}
			else{
				stack.push(n);
			}
		}


	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();
	}
}