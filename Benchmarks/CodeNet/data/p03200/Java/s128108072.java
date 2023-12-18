import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long sum=0;
		long w_ks=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='W') {
				sum+=i;
				w_ks++;
			}
		}
		System.out.println(sum-w_ks*(w_ks-1)/2);
	}
}