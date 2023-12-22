import java.util.*;

public class Main {
	public static void main(String[] args) {
			Scanner scan =  new Scanner(System.in);
			int N = scan.nextInt();
			int K = scan.nextInt();
			ArrayList<Integer> al = new ArrayList<>();
			for(int i=0;i<N;i++){
				al.add(scan.nextInt());
			}
			Collections.sort(al);
			int ans = 0;
			for(int i=0;i<K;i++){
				ans+=al.get(i);
			}
			System.out.println(ans);
	}
}
