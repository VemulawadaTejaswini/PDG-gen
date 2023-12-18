import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
	public static void main(String[] args) {
		execute();
	}
 
	private static void execute() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long s = sc.nextLong();
			int[] arr = new int[n];
			
			for(int i=n-1; i>=0; i--) {
				arr[i] =(int)s%10;
				s /=10;
			}
			
			Set<Integer> first = new HashSet<>();
			long ans = 0;
			for(int x=0; x<n-2; x++) {
				if(first.contains(arr[x])) {
					continue;
				}
				first.add(arr[x]);
				Set<Integer> second = new HashSet<>();
				for(int y=x+1; y<n-1; y++) {
					if(second.contains(arr[y])) {
						continue;
					}
					second.add(arr[y]);
					Set<Integer> third = new HashSet<>();
					for(int z=y+1; z<n; z++) {
						if(third.contains(arr[z])) {
							continue;
						}
						third.add(arr[z]);
						ans++;
					}
				}
			}
			
			System.out.println(ans);
			
		}
	}
}