import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

//Old Memories
public class Main{

	Set<String> s;
	SortedSet<String> ans;

	Set<String> make(boolean check){
		if(!check){
			Set<String> res = new HashSet<String>();
			for(String v:s){
				res.add(v);
				StringBuffer f = new StringBuffer(v);
				int n = v.length();
				for(int i=0;i<=n;i++){
					for(char ch='A';ch<='Z';ch++){
						f.insert(i, ch); res.add(f.toString()); f.deleteCharAt(i);
					}
					f.insert(i, '.'); res.add(f.toString()); f.deleteCharAt(i);
				}
				for(int i=0;i<n;i++){
					char t = f.charAt(i);
					f.deleteCharAt(i); res.add(f.toString()); f.insert(i, t);
				}
				for(int i=0;i<n;i++){
					char t = f.charAt(i);
					for(char ch='A';ch<='Z';ch++){
						f.setCharAt(i, ch); res.add(f.toString()); f.setCharAt(i, t);
					}
					f.setCharAt(i, '.'); res.add(f.toString()); f.setCharAt(i, t);
				}
			}
			return res;
		}
		for(String v:s){
			f(v.length(), v);
			StringBuffer f = new StringBuffer(v);
			int n = v.length();
			for(int i=0;i<=n;i++){
				for(char ch='A';ch<='Z';ch++){
					f.insert(i, ch);
					String t = f.toString();
					f(t.length(), t);
					f.deleteCharAt(i);
				}
				f.insert(i, '.'); 
				String t = f.toString();
				f(t.length(), t);
				f.deleteCharAt(i);
			}
			for(int i=0;i<n;i++){
				char t = f.charAt(i);
				f.deleteCharAt(i); 
				String st = f.toString();
				f(st.length(), st);
				f.insert(i, t);
			}
			for(int i=0;i<n;i++){
				char t = f.charAt(i);
				for(char ch='A';ch<='Z';ch++){
					f.setCharAt(i, ch); 
					String st = f.toString();
					f(st.length(), st);
					f.setCharAt(i, t);
				}
				f.setCharAt(i, '.'); 
				String st = f.toString();
				f(st.length(), st);
				f.setCharAt(i, t);
			}
		}
		return null;
	}

	void f(int tail, String v){
		if(tail==0){
			ans.add(v); return;
		}
		for(int i=tail-len;i<tail;i++){
			if(i<0||i+len>v.length())continue;
			String sub = v.substring(i, i+len);
			for(int j=0;j<n;j++)if(sub.hashCode()==hash[j]){
				f(i, v); return;
			}
		}
	}
	int[] hash;
	String[] p;
	int len, n;

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int d = sc.nextInt();
			n = sc.nextInt();
			if((d|n)==0)break;
//			long time = System.currentTimeMillis();
			s = new HashSet<String>();
			s.add(sc.next());
			p = new String[n];
			for(int i=0;i<n;i++)p[i] = sc.next();
			len = p[0].length();
			hash = new int[n];
			for(int i=0;i<n;i++)hash[i]=p[i].hashCode();
			ans = new TreeSet<String>();
			while(--d>0)s = make(false);
			make(true);
			System.out.println(ans.size());
			if(ans.size()<=5){
				while(!ans.isEmpty()){
					String q = ans.first();
					System.out.println(q);
					ans.remove(q);
				}
			}
//			System.out.println(System.currentTimeMillis()-time);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}