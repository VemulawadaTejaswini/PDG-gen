import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0258().doIt();
	}
	
	class AOJ0258{
		int n;
		int[] input;
		
		void solve(){
			int result = -1;
			for(int i=0;i<=n;i++){
				ArrayList<Integer> list = new ArrayList<Integer>();
				for(int s=0;s<=n;s++)if(s!=i){
					list.add(input[s]);
				}
				int crr = list.get(1)-list.get(0);
				boolean sw = true;
				for(int s=0;s<list.size()-1;s++)if(list.get(s+1)-list.get(s)!=crr)sw=false;
				if(sw){
					result = input[i];break;
				}
			}
			System.out.println(result);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				input = new int[n+1];
				for(int i=0;i<=n;i++)input[i] = in.nextInt();
				solve();
			}
		}
	}
	
}