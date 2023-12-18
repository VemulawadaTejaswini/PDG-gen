import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	public static void main(String[] args) {
		//int N=sc.nextInt();
		int a[]=new int[9];
		for(int i=0;i<9;i++) {
			a[i]=sc.nextInt();
		}
		int N=sc.nextInt();
		int b[]=new int[N];
		for(int i=0;i<N;i++){
			b[i]=sc.nextInt();
			
		}
		for(int i=0;i<9;i++) {
			if(Arrays.asList(b).contains(a[i])) {
				a[i]=-1;
			}
		}
		if(a[0]==a[1]&&a[1]==a[2]&&a[1]==-1) {
			p("Yes");
		}
		else if(a[3]==a[4]&&a[4]==a[5]&&a[4]==-1) {
			p("Yes");
		}
		else if(a[6]==a[7]&&a[7]==a[8]&&a[7]==-1) {
			p("Yes");
		}
		else if(a[0]==a[3]&&a[6]==a[3]&&a[3]==-1) {
			p("Yes");
		}
		else if(a[1]==a[4]&&a[4]==a[7]&&a[4]==-1) {
			p("Yes");
		}
		else if(a[2]==a[5]&&a[5]==a[8]&&a[8]==-1) {
			p("Yes");
		}
		else if(a[0]==a[4]&&a[4]==a[8]&&a[4]==-1) {
			p("Yes");
		}
		else if(a[2]==a[4]&&a[4]==a[6]&&a[4]==-1) {
			p("Yes");
		}else {
			p("No");
		}
		
		
	}
}