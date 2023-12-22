import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new C().doIt();
	}
	
	class C{
		int n,c;
		ArrayList<Pair> list;
		void doIt(){
			n = in.nextInt();
			c = in.nextInt();
			list = new ArrayList<Pair>();
			for(int i=0;i<c;i++)list.add(new Pair(in.nextInt(), in.nextInt()));
			Collections.sort(list);
//			System.out.println(list);
			int[] hyou = new int[n+1];
			for(int i=1;i<=n;i++){
				hyou[i] = hyou[i-1];
				for(int s=0;s<c;s++){
					if(list.get(s).a==i)hyou[i]+=1;
					else if(list.get(s).b==i)hyou[i]-=1;
				}
			}
			int memo = -1;
			for(int i=1;i<=n;i++){
				if(hyou[i]>0){
					if(memo==-1)memo = i; 
					hyou[i] = -1;
				}else{
					if(hyou[i-1]==-1){
						hyou[i] = memo;
						memo = -1;
					}
				}
			}
			int cnt = 0;
			for(int i=0;i<=n;i++){
				if(hyou[i]>0){
					cnt += (i-hyou[i])*2;
				}
				cnt++;
			}
			System.out.println(cnt);
		}
		
		class Pair implements Comparable<Pair>{
			int a,b;
			public Pair(int a,int b) {
				this.a = a;
				this.b = b;
			}
			
			public int compareTo(Pair o) {
				return this.b-o.b;
			}
			
			public String toString(){
				return "["+a+", "+b+"]";
			}
		}
		
	}
	
}