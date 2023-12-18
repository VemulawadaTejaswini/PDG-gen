import java.util.Arrays;
import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());	}

	public static void main(String[] $){
		int n=gInt();
		int[]a=new int[n];
		for(int i=0;i<n;++i)
			a[i]=gInt();
		for(int i=0;i<32;++i) {
			int b=1<<i;
			if(Arrays.stream(a)
					.anyMatch(o->o%b!=0)) {
				System.out.println(i-1);
				return;
			}
		}
	}
}