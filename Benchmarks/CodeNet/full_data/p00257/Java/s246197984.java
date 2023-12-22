import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0262().doIt();
	}

	class AOJ0262{
		int max,n;
		int[] masu;
		boolean search[];
		
		void dfs(int index){
			if(index<=0)index = 0;
			if(index>n)index = n+1;
			if(search[index])return;
			search[index] = true;
			for(int i=1;i<=max;i++){
				dfs(i+index+masu[i+index]);
			}
		}
		
		void doIt(){
			while(true){
				max = in.nextInt();
				if(max==0)break;
				n = in.nextInt();
				masu = new int[n+300];
				boolean sw[] = new boolean[max];
				for(int i=1;i<=n;i++)masu[i] = in.nextInt();
				for(int i=1;i<=max;i++){
					search = new boolean[n+2];
					dfs(i+masu[i]);
					if(search[n+1])sw[i-1] = true;
					else if(!search[0]&&!search[n+1])sw[i-1] = false;//スタートにも行けてなくてゴールにも行けてない。
				}
				boolean a = true;
//				for(int i=0;i<max;i++)System.out.println(sw[i]);
				for(int i=0;i<max;i++)if(sw[i]==false)a = false;
				System.out.println(a? "OK":"NG");
			}
		}
	}

}