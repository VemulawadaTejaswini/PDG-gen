import java.util.Scanner;
import java.util.Stack;
public class Main{
	Stack<Integer> stack = new Stack<Integer>();
	public static void main(String[] args) {
		new Main().run();
	}

	void run(){
		Scanner sc =  new Scanner(System.in);
		while(true){
			if(!sc.hasNext()){
				break;
			}
			int a = sc.nextInt();
			int[] b = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
			solve(a,b,b.length-1);
			StringBuilder sb = new StringBuilder();
			while(!stack.empty()){
				sb.append(stack.pop()+" ");
			}
			System.out.println(sb.deleteCharAt(sb.length()-1));
			System.out.println("");
		}
	}

	void solve(int a, int[] b, int i){
		if(a >= b[i] && a != 0){
			a -= b[i];
			stack.push(b[i]);
		}
		if(i != 0){
			solve(a, b, --i);
		}
	}
}