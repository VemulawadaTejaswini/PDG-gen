import java.util.*;

public class Main {
	String s;
	char[] a, b;
	int n;
	int id, pos;
	
	void A(){
		while(true){
			int start = pos;
			int t = id;
			int num = 1;
			int goal;
			while(Character.isDigit(a[id])==true) id++;
			if(id!=t) num = Integer.valueOf(s.substring(t,id));
			B();
			
			goal = pos;
			for(int i=0;i<num-1;i++){
				for(int j=start;j<goal;j++){
					if(pos>n || j>n){
						i = num;
						break;
					}
					b[pos] = b[j];
					pos++;
				}
			}
			if(id==a.length || a[id]==')') break;
		}
	}
	
	void B(){
		if(a[id]=='('){
			id++;
			A();
			id++;
		}else{
			int t = id;
			while(id<s.length() && Character.isUpperCase(a[id])==true) id++;
			if(id==a.length || a[id]==')' || Character.isDigit(a[id])==true){
				for(int i=t;i<id;i++){
					if(pos>n) break;
					b[pos] = a[i];
					pos++;
				}
			}
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			s = sc.next();
			a = s.toCharArray();
			n = sc.nextInt();
			if(a[0]=='0' && n==0) break;
			b = new char[n+1];
			Arrays.fill(b,'0');
			id = 0;
			pos = 0;
			A();
			
			
			System.out.println(b[n]);
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}