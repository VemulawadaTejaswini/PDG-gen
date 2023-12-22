import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		solve();
	}

	private static void solve(){
		Scanner sc=new Scanner(System.in);

		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			Map<String,String> map=new HashMap<String,String>();
			for(int i=0;i<n;i++)
				map.put(sc.next(), sc.next());
			n=sc.nextInt();
			for(int i=0;i<n;i++){
				String s=sc.next();
				if(map.containsKey(s))
					System.out.print(map.get(s));
				else 
					System.out.print(s);
			}
			System.out.print("\n");
		}
	}
}