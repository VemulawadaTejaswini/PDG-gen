import java.util.*;

public class Main {
	boolean flag;
	char[] a;
	int pos;
	
	void cat(){
		if(pos<a.length && a[pos]=='m') pos++;
		else flag = false;
		if(flag==false) return;
		
		if(pos<a.length && a[pos]=='m') cat();
		if(pos<a.length && a[pos]=='e') pos++;
		else flag = false;
		if(flag==false) return;
		
		if(pos<a.length && a[pos]=='m') cat();
		if(pos<a.length && a[pos]=='w') pos++;
		else flag = false;
		if(flag==false) return;
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			a = sc.next().toCharArray();
			if(a.length%3!=0){
				System.out.println("Rabbit");
			}else{
				flag = true;
				pos = 0;
				cat();
				if(flag==true && pos==a.length) System.out.println("Cat");
				else System.out.println("Rabbit");
			}
		}		
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}