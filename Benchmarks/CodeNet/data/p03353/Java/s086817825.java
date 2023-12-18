import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		//String[] s = S.split("");
		int k = Integer.parseInt(sc.next());
		ArrayList<String> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<S.length(); i++) {
		    for(int j=i; j<=Math.min(S.length(), 5); j++) {
		        String x = S.substring(i, j);
		        if(list.contains(x)) continue;
		        else list.add(x);
		    }
		}
		Collections.sort(list);
		System.out.println(list.get(k));
	}
}