import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main{

	static Stack<String>[] stacks;
	static List<String> list=new ArrayList<String>();

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		stacks=new Stack[count];

		for(int i=0;i<count;i++){
			stacks[i]=new Stack<String>();
		}

		while(true){
			String[] command=scanner.nextLine().split(" ");
			if(command[0].equals("quit")){
				break;
			}else if(command[0].equals("push")){
				push(Integer.parseInt(command[1]),command[2]);
			}else if(command[0].equals("pop")){
				pop(Integer.parseInt(command[1]));
			}else if(command[0].equals("move")){
				move(Integer.parseInt(command[1]),Integer.parseInt(command[2]));
			}
		}
		for(String s:list){
			System.out.println(s);
		}
	}

	public static void push(int i,String block){
		stacks[i-1].push(block);
	}

	public static void pop(int i){
		list.add(stacks[i-1].pop());
	}

	public static void move(int a,int b){
		stacks[b-1].push(stacks[a-1].pop());
	}
}