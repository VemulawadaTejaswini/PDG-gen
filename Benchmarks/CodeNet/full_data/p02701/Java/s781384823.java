import java.util.Scanner;

public class Main {
	static int N;
	static int a=0;
	static int b=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		String S[]=new String[N];
		for(int i=0;i<N;i++) {
		S[i]=sc.next();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<i;j++) {
				if(S[j]==S[i]) {
					a=1;
				}
			}
			if(a==0) {
				b++;
			}
			a=0;
		}
		System.out.println(b);