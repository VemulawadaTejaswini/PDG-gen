import java.util.ArrayList;
import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int n;
		String[] str;
		String s;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> pop = new ArrayList<String>();
		int[] current = new int[100];
		
		n = Integer.valueOf(scan.nextLine());
		Stack[] stack = new Stack[n];
		for(int i=0;i<n;i++){
			stack[i] = new Stack();
		}
		
		while(true){
			s = scan.nextLine();
			str = s.split(" ");
			if(str[0].equals("quit")){
				break;
			}else if(str[0].equals("push")){
				stack[Integer.valueOf(str[1])-1].push(str[2]);
			}else if(str[0].equals("pop")){
				pop.add(stack[Integer.valueOf(str[1])-1].pop());
			}else if(str[0].equals("move")){
				stack[Integer.valueOf(str[2])-1].push(stack[Integer.valueOf(str[1])-1].pop());
			}
		}
		
		for(String string:pop){
			System.out.println(string);
		}
	}
}

class Stack{
	ArrayList<String> s;
	int current;
	
	Stack(){
		s = new ArrayList<String>();
		current = -1;
	}
	
	public void push(String str){
		s.add(str);
		current++;
	}
	
	public String pop(){
		String str = s.get(current);
		s.remove(current);
		current--;
		return str;
	}
}