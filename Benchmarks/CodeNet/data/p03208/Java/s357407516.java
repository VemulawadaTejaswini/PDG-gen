import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();	
		ArrayList<Integer> solist = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
				solist.add(x);		
		}
		Collections.sort(solist);
		int ans=999999999;
		int tori;
		for (int i = 0; i < n-k+1; i++) {
			tori=solist.get(i+k-1)-solist.get(i);
			if(tori<ans) {
				ans=tori;
			}
		}
		System.out.println(ans);	
	}
}