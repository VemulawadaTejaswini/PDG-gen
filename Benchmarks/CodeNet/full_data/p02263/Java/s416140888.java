import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in)
								.useDelimiter("[\\s]+");
	private static final MAX = 101;
	private static int[] st = new int[MAX]:
	private int top;

	public static void main(String[] args){

		initialize();
		while(scan.hasNext()){
			String[] cmd = nextLine();
			for(int i = 0; i < cmd.length; i++){
				if(cmd[i].equals("+")){
					int n2 = pop();
					int n3 = pop();
					n2 = n3 + n2;
					push(n2);
				}else if(cmd[i].equals("-")){
					int n2 = pop();
					int n3 = pop()
					n2 = n3 - n2;
					push(n2);
				}else if(cmd[i].equals("*")){
					int n2 = pop();
					int n3 = pop();
					n2 = n3 * n2;
					push(n2);
				}else{
					int n = Integer.parseInt(cmd[i]);
					push(n);
				}
			}
		}
	}

	public static initialize(){
		top = 0;
	}
	private static boolean isEmpty(){
		return top == 0;
	}
	private static boolean isFull(){
		return top >= MAX - 1;
	}
	public static void push(int x){
		if(isFull())
			System.out.printf("%s\n", "???????????????????????§???");
		top++;
		st[top] = x;
	}
	public static int pop(){
		if(isEmpty())
			System.out.printf("%s\n", "??¢????????????????????§???");
		top--;
		return st[top+1];
	}
}