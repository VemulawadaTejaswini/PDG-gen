import java.util.*;

public class Main{
	public static void main(String[] args){
		int i,n,size=0,ans=0;
		boolean flg;
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> a = new LinkedList<Integer>(),
			list = new LinkedList<Integer>();

		list.add(0);
		while(true){
			if((n=scan.nextInt()) == 0) break;
			for(i=0,a.clear();i<n;i++) a.add(scan.nextInt());

			flg = true;
			while(flg && a.size()>n/2){
				list.set(0,a.get(0));
				size = a.size();
				a.removeAll(list);
				if(size-a.size() > n/2) flg = false;
			}

			if(flg) System.out.println("NO COLOR");
			else System.out.println(list.get(0));
		}
	}
}