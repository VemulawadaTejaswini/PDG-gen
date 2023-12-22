import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		Deque<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			String command=sc.nextLine();
			if(command.equals("insert")){
				list.addFirst(Integer.parseInt(command.substring(7)));
			}else if(command.equals("delete")){
				list.remove(Integer.parseInt(command.substring(7)));
			}else if(command.equals("deleteFirst")){
				list.removeFirst();
			}else if(command.equals("deleteLast")){
				list.removeLast();
			}
		}
		while(list.size()!=1){
			System.out.print(list.poll()+" ");
		}
		System.out.println(list.poll());
	}

}