import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> inputList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			inputList.add(Integer.parseInt(sc.next()));
		}

		int ans = 0;
		for (int i=0; i<n; i++) {
			long sum = 0;
			for(int l=i; l<n; l++) {
				sum += inputList.get(l);
				if (sum == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}