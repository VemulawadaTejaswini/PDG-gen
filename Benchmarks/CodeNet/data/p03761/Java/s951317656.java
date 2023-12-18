import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		Map<Character,Integer>map=new TreeMap<>();
		for(int i=0;i<n;i++) {
			String s=scanner.next();
			for(char c='a';c<='z';c++) {
				int cnt=0;
				for(int j=0;j<s.length();j++) {
					if(c==s.charAt(j)) {
						cnt++;
					}
				}
				if (map.containsKey(c)) {
					int tmp=map.get(c);
					tmp=Math.min(tmp, cnt);
					map.put(c, tmp);
				} else {
					map.put(c, cnt);
				}
			}
		}
		for(char c:map.keySet()) {
			for(int i=0;i<map.get(c);i++) {
				System.out.print(c);
			}
		}
		System.out.println("");
	}
}