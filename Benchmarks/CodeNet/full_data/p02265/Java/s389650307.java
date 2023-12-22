import java.util.LinkedList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		LinkedList<Integer> lnk=new LinkedList<Integer>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String s=sc.next();
			
			if(s.equals("deleteFirst"))lnk.remove();
			else if(s.equals("deletelast"))lnk.removeLast();
			else  {int a=sc.nextInt();
				if(s.equals("insert"))lnk.add(a);
			else if(s.equals("delete")) lnk.remove(a);}
			
		}for(int i:lnk)System.out.println(i);
	}
}