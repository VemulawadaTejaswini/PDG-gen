import java.util.ArrayList;
import java.util.Scanner;

class Main {
	static int ans=0;
	static ArrayList<Integer> list;
	static ArrayList<ArrayList<Integer>> llist=new ArrayList<ArrayList<Integer>>();
	static int n,m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();m=sc.nextInt();
		for(int i=0;i<n+1;i++){
			list=new ArrayList<Integer>();
			llist.add(list);
		}
		for(int i=0;i<m;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			llist.get(a).add(b);
			llist.get(b).add(a);
		}
		boolean[] check=new boolean[n+1];
		int cnt=1;
		search(cnt,check,1);
		System.out.println(ans);
	}

	static void search(int cnt,boolean[] check,int ind){
		ArrayList<Integer> list=llist.get(ind);
		check[ind]=true;
		if(cnt==n){
			ans++;
			return;
		}

		for(int i=0;i<list.size();i++){
			int next=list.get(i);
//			System.out.println(next);
			if(!check[next]){
				search(++cnt,check,next);
			}

		}
		return;
	}

}
