import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0069().doIt();
	}
	
	class AOJ0069{
		int n,start,atari,d;
		char[][] map;
		void solve(){
			int[] a = new int[d+1];
			int[] b = new int[d+1];
			int current = atari;
			a[d] = current;
			for(int i=d-1;i>=0;i--){
				if(current < n-1 && map[i][current]=='1')current++;
				else if(current-1>=0&&map[i][current-1]=='1')current--;
				a[i] = current;
			}
//			System.out.println(Arrays.toString(a));
			b[0] = start;
			current = start;
			for(int i=1;i<=d;i++){
				if(current < n-1 && map[i-1][current]=='1')current++;
				else if(current-1>=0&&map[i-1][current-1]=='1')current--;
				b[i] = current;
			}
//			System.out.println(Arrays.toString(b));
			if(a[0]==b[0]){
				System.out.println(0);return;
			}
			
//			for(int i=0;i<=d;i++){
//				System.out.println(a[i]+" "+b[i]);
//			}
			for(int i=0;i<d;i++){
//				System.out.println(a[i]+" "+b[i+1]);
				if(Math.abs(a[i]-b[i+1])==1){
					int min = Math.min(a[i], b[i+1]);
					int max = Math.max(a[i], b[i+1]);
					if(min==0||map[i][min-1]=='0')
						if(max==n-1||map[i][max]=='0')
							if(map[i][min]=='0'){
								System.out.println((i+1)+" "+max);return;
							}
				}
			}
			System.out.println(1);
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				start = in.nextInt()-1;
				atari = in.nextInt()-1;
				d = in.nextInt();
				map = new char[d][n-1];
				for(int i=0;i<d;i++)map[i] = in.next().toCharArray();
//				for(int i=0;i<d;i++){
//					for(int s=0;s<n-1;s++)System.out.print(map[i][s]+" ");System.out.println();
//				}
				solve();
			}
		}
	}
	
}