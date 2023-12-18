import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[1000000000*2];
		String s = sc.next();
		List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		int q = sc.nextInt();
		int count=0;
		for(int i=0;q>i;i++) {
			int t = sc.nextInt();
			if(t==1) {
				count++;
			}
			else {
				int x = sc.nextInt();
				String tui = sc.next();
				if(x==2 && count%2==0)
					list.add(tui);
				else if(x==1 && count%2==0)
					list.add(0, tui);
				else if (x==2 && count%2==1)
					list.add(0,tui);
				else
					list.add(tui);
			}
		}
		if(count%2==1)
			Collections.reverse(list);
		for(int i=0;list.size()>i;i++) {
			System.out.print(list.get(i));
		}
		//System.out.println(list);
	}
}