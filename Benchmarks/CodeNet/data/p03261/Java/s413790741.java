import java.util.*;

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		HashSet<String>h=new HashSet<>();
		String v=s.next();
		h.add(v);
		for(int i=1;i<n;++i) {
			String w=s.next();
			if(v.charAt(v.length()-1)!=w.charAt(0)||!h.add(w)) {
				System.out.println("No");
				return;
			}
			v=w;
		}
		System.out.println("Yes");
	}
}
