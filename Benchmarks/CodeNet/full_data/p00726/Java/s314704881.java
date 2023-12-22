import java.util.*;

public class Main {
	String s;
	boolean[] f;
	int n;
	
	void func(){
		String u;
		StringBuilder sb = new StringBuilder();
		int p, q, r, t, id;
		boolean check = false;
		while(true){
			t = 0;
			while(true){
				p = s.indexOf(')', t);
				if(p==-1 || f[p]==false) break;
				t = p+1;
			}
			t = p;
			while(true){
				q = s.lastIndexOf('(', t);
				if(q==-1 || f[q]==false) break;
				t = q-1;
			}
			
			if(p==-1 && q==-1) break;
			
			f[p] = true;
			f[q] = true;
			r = 1;
			id = q-1;
			while(id!=-1 && Character.isDigit(s.charAt(id))==true) id--;
			u = s.substring(id+1, q);
			if(u.compareTo("")!=0) r = Integer.valueOf(u); 
			
			if(f[p-1]==false){
				u = s.substring(q+1,p);
				for(int i=0;i<r;i++) sb.append(u);
			}else{
				u = sb.toString();
				for(int i=0;i<r-1;i++) sb.append(u);
			}
			
			check = true;
			if(sb.length()>n) break;
		}
		
		if(check==false){
			if(s.length()>n) System.out.println(s.charAt(n));
			else System.out.println(0);
		}else{
			if(sb.length()>n) System.out.println(sb.charAt(n));
			else System.out.println(0);
		}
	}
	
	
	String tf(char[] a){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<a.length;i++){
			if(Character.isUpperCase(a[i])==true
				&& (i==0 || Character.isUpperCase(a[i-1])==false)
					&& (i==a.length-1 || Character.isUpperCase(a[i+1])==false)){
						sb.append('(').append(a[i]).append(')');
			}else{
				sb.append(a[i]);
			}
		}
		return sb.toString();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			char[] a = sc.next().toCharArray();
			n = sc.nextInt();
			if(a[0]=='0' && n==0) break;
			s = tf(a);
			f = new boolean[s.length()];
			func();
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}