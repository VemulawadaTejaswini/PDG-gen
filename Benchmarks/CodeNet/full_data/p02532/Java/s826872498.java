import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main{

	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int count=scanner.nextInt();
		@SuppressWarnings("unchecked")
		Stack<String>[] stacks=new Stack[count];
		List<String> list=new ArrayList<String>();

		for(int i=0;i<count;i++){
			stacks[i]=new Stack<String>();
		}

		while(true){
			String[] command=scanner.nextLine().split(" ");
			if(command[0].equals("quit")){
				break;
			}else if(command[0].equals("push")){
				stacks[Integer.parseInt(command[1])].push(command[2]);
			}else if(command[0].equals("pop")){
				list.add(stacks[Integer.parseInt(command[1])-1].pop());
			}else if(command[0].equals("move")){
				stacks[Integer.parseInt(command[2])-1].push(stacks[Integer.parseInt(command[1])-1].pop());
			}
		}
		for(String s:list){
			System.out.println(s);
		}
	}
}