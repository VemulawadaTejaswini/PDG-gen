import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int s[]=new int[a];
		int f[]=new int[a];
		int b[]=new int[a];
		for(int i=0;i<a;i++) {
			s[i]=scan.nextInt();
		}
		for(int i=0;i<a;i++) {
			f[i]=scan.nextInt();
		}
		for(int i=0;i<a;i++) {
			b[i]=s[i]-f[i];
		}
		Arrays.sort(b);
		int ans=0;
		for(int i=a-1;i>-1;i--) {
			if(b[i]<0) {
				break;
			}
			ans+=b[i];
		}
		System.out.println(ans);
	}
}
