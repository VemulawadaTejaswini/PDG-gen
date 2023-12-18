import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		String s = sc.next();
		int[] map = new int[s.length()];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='A'&&i+1<s.length())
				if(s.charAt(i+1)=='C') {
					map[i] = 1;
					map[i+1] = 2;
					i++;
				}
		}
		
		
		for(int i=0;i<q;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int res = FlagCount(s,map,a,b);
			System.out.println(res);
		}
		
	}
	
	public static int FlagCount(String s,int[] map,int a,int b) {
		int sum = 0;
		if(map[a-1]==2)a++;
		if(map[b-1]==1)b--;
		for(int i=a-1;i<b;i++) {
			sum += map[i];
		}
		return sum/3;
		
	}
	
	
}
