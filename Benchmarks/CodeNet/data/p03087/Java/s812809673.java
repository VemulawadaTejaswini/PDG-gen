import java.util.Scanner;

public class Main {
	public static void main(String args[]) {	
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());
		String s = sc.next();
		for(int i=0;i<q;i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			int res = ACcount(s,a,b);
			System.out.println(res);
		}
		
	}
	
	public static int ACcount(String s,int a ,int b) {
		int count = 0;
		for(int i=a-1;i<b;i++) {
			if(s.charAt(i)=='A'&&i+1<b)
				if(s.charAt(i+1)=='C') {
					count++;
					i++;
				}
		}
		
		return count;
			
	}
}
