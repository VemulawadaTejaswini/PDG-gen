import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[][] s = new char[n][10];
		HashMap<String,Integer> h = new HashMap<>();
		int ans=0;
		
		for(int i=0;i<n;i++) {
			s[i] = sc.next().toCharArray();
			Arrays.parallelSort(s[i]);
			String st = String.valueOf(s[i]);
			if(h.containsKey(st)) {
				int temp = h.get(st);
				ans+=temp;
				h.put(st,temp+1);
			}else h.put(st,1);
			

		}
		
		System.out.println(ans);
		sc.close();
	}
		


}
