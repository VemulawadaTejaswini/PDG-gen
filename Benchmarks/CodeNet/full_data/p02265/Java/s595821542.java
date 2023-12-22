import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String str=cin.next();
			if(str.equals("insert")) {
				int x=cin.nextInt();
				list.add(0,x);
			}
			else if(str.equals("delete")) {
				int x=cin.nextInt();
				int v=list.indexOf(x);
				if(v!=-1)list.remove(v);
			}
			else if(str.equals("deleteFirst"))list.remove(0);
			else if(str.equals("deleteLast"))list.remove(list.size()-1);
			//System.out.println(i);
		}
		
		int lim=list.size();
		for(int i=0;i<lim;i++) {
			if(i==lim-1)System.out.println(list.get(i));
			else System.out.print(list.get(i)+" ");
		}
	}

}

