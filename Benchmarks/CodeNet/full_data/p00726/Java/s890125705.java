import java.util.*;

public class Main {
	String s;
	char[] b;
	boolean[] f;
	int n;
	
	void func(){
		String u;
		int pos = 0;
		int p, q, r, t, id;
		boolean flag = false;
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
				for(int i=0;i<r;i++){
					for(int j=0;j<p-q-1;j++){
						b[pos] = u.charAt(j);
						pos++;
						if(pos==n+1){
							i = r;
							j = p;
							flag = true;
						}
					}
				}
			}else{
				t = pos;
				for(int i=0;i<r-1;i++){
					for(int j=0;j<t;j++){
						b[pos] = b[j];
						pos++;
						if(pos==n+1){
							i = r;
							j = t;
							flag = true;
						}
					}
				}
			}
			
			if(flag==true) break;
		}
	}
	
	String tf(char[] a){
		StringBuilder sb = new StringBuilder();
		char[] c = new char[1000];
		int pos = 0;
		for(int i=0;i<a.length;i++){
			if(Character.isUpperCase(a[i])==true){
				if(i==0 || i==a.length-1 || c[pos-1]==')' || Character.isDigit(c[pos-1])==true || (c[pos-1]=='(' && Character.isUpperCase(a[i+1])==false)){
					c[pos] = '(';
					c[pos+1] = a[i];
					c[pos+2] = ')';
					pos += 3;
				}else{
					c[pos] = a[i];
					pos++;
				}
			}else{
				c[pos] = a[i];
				pos++;
			}
		}
		for(int i=0;i<pos;i++) sb.append(c[i]);
		return sb.toString();
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			char[] a = sc.next().toCharArray();
			n = sc.nextInt();
			if(a[0]=='0' && n==0) break;
			s = tf(a);
			System.out.println(s);
			f = new boolean[s.length()];
			b = new char[n+1];
			Arrays.fill(b,'0');
			func();
			System.out.println(b[n]);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}