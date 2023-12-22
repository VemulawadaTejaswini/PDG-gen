import java.util.Scanner;
import java.util.Stack;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;){
			String s = sc.nextLine();
			if(s.equals("."))break;
			Stack<Integer>stack=new Stack<Integer>();
			boolean f = true;
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)=='('){
					stack.add(1);
				}
				else if(s.charAt(i)=='['){
					stack.add(2);
				}
				else if(s.charAt(i)==')'){
					if(stack.size()==0||stack.pop()!=1){
						f=false;
					}
				}
				else if(s.charAt(i)==']'){
					if(stack.size()==0||stack.pop()!=2){
						f=false;
					}
				}
			}
			if(stack.size()==0){
				if(f){
					System.out.println("yes");
				}
				else{
					System.out.println("no");
				}
			}
			else{
				System.out.println("no");
			}
		}

	}

}