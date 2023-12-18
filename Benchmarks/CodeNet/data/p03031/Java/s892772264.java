import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		ArrayList<Integer>adj[]=new ArrayList[m];
		for(int i=0;i<m;i++)
			adj[i]=new ArrayList<>();
		for(int i=0;i<m;i++){
			int c=sc.nextInt();
			for(int j=0;j<c;j++)
				adj[i].add(sc.nextInt());
		}
		int cnt=0;
		ArrayList<Integer> stat=new ArrayList<>();
		for(int i=0;i<m;i++)
			stat.add(sc.nextInt());
		//System.out.println(stat);
		ArrayList<Integer> curr=new ArrayList<>();
		for(int i=0;i<(1<<n);i++){
			for(int j=0;j<n;j++)
				curr.add((i>>j)&1);
		//	System.out.println(curr);
			boolean v=true;
			for(int l=0;l<m;l++){
				int cc=0;
				for(Integer k:adj[l])
					cc+=curr.get(k-1);
				
				if(cc%2!=stat.get(l))
					v=false;
			}
			//System.out.println(cc);
			if(v)
				cnt++;
			//System.out.println(cnt);
			curr.clear();
		}
		System.out.println(cnt);
	}
}