import java.util.*;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);

		int cnt=0;
		int n=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			int m=sc.nextInt();
			if(list.contains(m))
				cnt++;
		}
		System.out.println(cnt);
	}
}