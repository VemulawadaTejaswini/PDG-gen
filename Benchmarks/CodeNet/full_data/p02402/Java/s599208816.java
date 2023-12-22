import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int foo[] = new int[n];
		for(int i=0;i<n;i++) {
			foo[i]=sc.nextInt();
		}
		int max=foo[0];
		int min=foo[0];
		long num=foo[0];
		for(int i=1;i<n;i++) {
			if(max<foo[i]) {
				max=foo[i];
			}
			if(min>foo[i]) {
				min=foo[i];
			}
			num+=foo[i];
		}
		System.out.println(min+" "+max+" "+num);
	}
}

