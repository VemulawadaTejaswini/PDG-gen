import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args){
		sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			String command=sc.next();
			if(command.equals("insert")){
				int x=sc.nextInt();
				list.addFirst(x);
			}else if(command.equals("delete")){
				int x=sc.nextInt();
				list.remove((Integer)x);
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