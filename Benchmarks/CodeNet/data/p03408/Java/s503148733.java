import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String s[]=new String [N];
		for(int i=0;i<N;i++) {
			s[i]=sc.next();
		}
		int M=sc.nextInt();
		String t[]=new String [M];
		for(int i=0;i<M;i++) {
			t[i]=sc.next();
		}
		int b=0;
		for(int i=0;i<N;i++) {
			int a=0;
			for(int k=0;k<N;k++) {
				if(s[i].equals(s[k])) {
					a=a+1;
				}
			}
			for(int k=0;k<M;k++) {
				if(s[i].equals(t[k])) {
					a=a-1;
				}
			}
			if(a>b) {
				b=a;
			}
		}
		System.out.println(b);
	}
}