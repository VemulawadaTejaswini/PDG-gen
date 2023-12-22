import java.util.Scanner;

public class Main {
	static int[] ascii = new int[53];
	static String move(String str,int m,char a) {
		int b = (int)a-m;
		if(b<65) {
			b = 123-(65-b);
		}
		if(90 < b && b < 97) {
			b = b-6;
		}
		a = (char)b;
		return str+a;
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n  = sc.nextInt();
			if(n==0)break;
			int[] k = new int[n+1];
			for(int i=0;i<n;i++){
				k[i] = sc.nextInt();
			}
			char[] str = sc.next().toCharArray();
			String ans = "";
			int m = str.length;
			for(int i=0;i<m;i++) {
				ans = move(ans,k[i%n],str[i]);
			}
			System.out.println(ans);
		}
	}
}
