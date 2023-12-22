//問題４　2704上石彩花
import java.util.Scanner;
public class Main{
	public void solve(){
		Scanner sc=new Scanner(System.in);
		int N,x;
		
		while(true){
			N=sc.nextInt();
			if(N==0) break;
			int cnt=0;
			boolean flag=false;
			for(int i=0;i<N;i++){
				x=sc.nextInt();
				if(x>0)
				cnt++;
				if(x>1)
				flag=true;
			}
			
			if(!flag)
			System.out.println("NA");
			else
			System.out.println(cnt+1);
		}
	}
	
	public static void main(String[]args){
		Main obj=new Main();
		obj.solve();
	}
}