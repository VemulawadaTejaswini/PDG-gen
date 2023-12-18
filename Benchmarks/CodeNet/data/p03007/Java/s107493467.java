import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		List <Integer>list=new ArrayList<Integer>();
		List <String>ans=new ArrayList<String>();
		for(int i=0;i<a;i++) {
			list.add(scan.nextInt());
		}
		Collections.sort(list);
		for(;;) {
			int hu=0;
			if(list.size()==1) {
				break;
			}
			int min=list.get(0);
			int max=list.get(list.size()-1);
			int niban=list.get(list.size()-2);
			
			if(niban<=0) {
				hu=max-niban;
				list.remove(list.size()-1);
				list.remove(list.size()-1);
				list.add(hu);
				ans.add(max+" "+niban);
			}
			else {
				hu=min-max;
				list.remove(list.size()-1);
				list.remove(0);
				list.add(hu);
				ans.add(min+" "+max);
			}
			Collections.sort(list);
		}
		System.out.println(list.get(0));
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
	}
}