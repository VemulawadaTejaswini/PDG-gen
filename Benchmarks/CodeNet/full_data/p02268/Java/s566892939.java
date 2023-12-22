import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Set<Integer> T = new TreeSet<Integer>();
		
		for(int i=0;i<n;i++){
			T.add(sc.nextInt());
		}
		int p = sc.nextInt();
		int cnt=0;
		for(int i=0;i<p;i++){
			int t= sc.nextInt();
			if(T.contains(t)){
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}