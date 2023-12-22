import java.util.*;
public class Main {
	int n;
	int[] num;
	Scanner stdin =new Scanner(System.in);
	
	void Solve(){
		num=new int[21000000];
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
		if(num[p]==1) return true;
		if(num[p]==-1) return false;
		
		if(p<4){
			num[p]=1;
			return true;
		}
		else{
			if(p%2==0){
				num[p]=-1;
				return false; 
			}
			
			for(int i=3;i<p;i++){
				if(p%i==0){
					num[p]=-1;
					return false;
				}
				i++;
			}
			num[p]=1;
			return true;
		}
	}
	
	
	
	public static void main(String args[]){
		Main m=new Main();
		m.Solve();
	}
	
}