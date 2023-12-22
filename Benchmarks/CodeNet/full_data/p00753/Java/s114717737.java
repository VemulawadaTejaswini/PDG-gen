import java.util.*;
public class Main {
	int n;
	Scanner stdin =new Scanner(System.in);
	
	void Solve(){
		while(true){
			n=stdin.nextInt();
			if(n==0) break;
			System.out.println(findPrime(n+1,2*n));
		}
		
	}
	int findPrime(int a,int b){
		int count=0;
		for(int i=a;i<=b;i++){
			if(judgePrime(i)) count++;
		}
		
		return count;
	}
	
	boolean judgePrime(int p){
		if(p<4) return true;
		else{
			for(int i=2;i<p;i++){
				if(p%i==0) return false;
			}
			return true;
		}
	}
	
	
	
	public static void main(String args[]){
		Main m=new Main();
		m.Solve();
	}
	
}