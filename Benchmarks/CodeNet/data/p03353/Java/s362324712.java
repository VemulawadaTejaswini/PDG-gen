import java.util.*;

public class Main {
	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final String s = sc.next();
		final int K = sc.nextInt();
		
		HashSet<String> subStrings = new HashSet<>();
		for(int i=0; i<s.length(); i++) {
			for(int j=1; j<=K; j++) {
				subStrings.add(s.substring(i, Math.min(i+j, s.length())));
			}
		}
		
		String [] substr = subStrings.toArray(new String[subStrings.size()]);
		Arrays.sort(substr);
		System.out.println(substr[K-1]);
		
		sc.close();
	}

}
