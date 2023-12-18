import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Long> list_p = new LinkedList<>();
		List<Long> list_n = new LinkedList<>();
		long ans = 0;
		for(int i=0;i<n;i++) {
			long tmp = in.nextInt();
			if(tmp>=0) {
				list_p.add(tmp);
				ans += tmp;
			}else {
				list_n.add(tmp);
				ans -= tmp;
			}
		}
		if(list_p.size()>1) list_p.sort((e1,e2)->e1>e2?-1:1);
		if(list_n.size()>1) list_n.sort((e1,e2)->e1<e2?-1:1);
		if(list_p.size()==0) ans += 2*list_n.get(list_n.size()-1);
		if(list_n.size()==0) ans -= 2*list_p.get(list_p.size()-1);
		System.out.println(ans);
		for(int i=0;i<n-1;i++) {
			if(list_n.size()==0 && n!=2) {
				long a = list_p.remove(0);
				long b = list_p.remove(list_p.size()-1);
				list_n.add(-a+b);
				System.out.println(b + " " + a);
			}else if(list_n.size()==0 && n==2){
				long a = list_p.remove(0);
				long b = list_p.remove(list_p.size()-1);
				list_p.add(a-b);
				System.out.println(a + " " + b);
			}else if(list_p.size()==0) {
				long a = list_n.remove(0);
				long b = list_n.remove(list_n.size()-1);
				list_p.add(-a+b);
				System.out.println(b + " " + a);
			}else {
				long a = list_p.remove(0);
				long b = list_n.remove(0);
				if(list_p.size()<=list_n.size()) {
					list_p.add(a-b);
					System.out.println(a + " " + b);
				}else {
					list_n.add(-a+b);
					System.out.println(b + " " + a);
				}
			}
		}
		
		in.close();

	}

}
