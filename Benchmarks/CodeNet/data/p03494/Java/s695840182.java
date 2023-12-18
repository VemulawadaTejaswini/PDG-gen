import java.util.Arrays;
import java.util.Scanner;
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a[]=new int[n];
		for(int i=0;i<n;++i)
			a[i]=s.nextInt();
		for(int i=0;i<32;++i) {
			int b=1<<i;
			if(Arrays.stream(a).anyMatch(o->o%b!=0)) {
				System.out.println(i-1);
				return;
			}
		}
	}
}