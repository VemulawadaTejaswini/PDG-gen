//2706 石井夏鈴 問4
import java.util.Scanner;
public class Main{
	int n,k;
	int cnt=0;
	
	public void solve(){
		Scanner sc=new Scanner(System.in);
		while(true){
			n=sc.nextInt();
			if(n==0) break;
			cnt=0;
			boolean flag=false;
			for(int i=0;i<n;i++){
				k=sc.nextInt();
				if(k>0) cnt++;
				if(k>1) flag=true;
			}
			
			if(!flag) System.out.println("NA");
			else System.out.println(cnt++);
		}
	}
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}