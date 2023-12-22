import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1142().doIt();
	}
	
	class AOJ1142{
		String text;
		void solve(){
			HashSet<String> set = new HashSet<String>();
			int n = text.length();
			for(int i=0;i<n;i++){
				StringBuilder t = new StringBuilder(text.substring(0,i));
				StringBuilder t2 = new StringBuilder(text.substring(i,text.length()));
				String a = t.toString() , b = t2.toString(), c = t.reverse().toString(), d = t2.reverse().toString(); 
//				System.out.println(a+" "+b);
//				System.out.println(c+" "+d);
//				HashSet<String> set2 = new HashSet<String>();
//				set2.add(a+b);set2.add(a+d);set2.add(c+b);set2.add(c+d);
//				set2.add(b+a);set2.add(d+a);set2.add(b+c);set2.add(d+c);
//				System.out.println(set2);
				set.add(a+b);set.add(a+d);set.add(c+b);set.add(c+d);
				set.add(b+a);set.add(d+a);set.add(b+c);set.add(d+c);
			}
//			System.out.println(set);
			System.out.println(set.size());
		}
		
		void doIt(){
			int a = in.nextInt();
			for(int i=0;i<a;i++){
				text = in.next();
				solve();
			}
		}
	}
	
}