import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Divisor is the Conqueror
public class Main{

	int n;
	int[] a, r;
	Set<String>[] u;
	
	boolean dfs(int k, int sum){
		String s = "";
		for(int i=1;i<14;i++)s+=a[i];
		if(u[sum].contains(s))return false;
		if(k==n)return true;
		for(int i=1;i<14;i++){
			if(0<a[i]&&sum%i==0){
				a[i]--;
				r[k] = i;
				if(dfs(k+1, sum+i))return true;
				a[i]++;
			}
		}
		u[sum].add(s);
		return false;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt();
			if(n==0)break;
			r = new int[n];
			a = new int[14];
			for(int i=0;i<n;i++)a[sc.nextInt()]++;
			u = new Set[365];
			for(int i=0;i<365;i++)u[i]=new HashSet<String>();
			if(!dfs(0, 0))System.out.println("No");
			else for(int i=0;i<n;i++)System.out.print(r[i]+(i==n-1?"\n":" "));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}