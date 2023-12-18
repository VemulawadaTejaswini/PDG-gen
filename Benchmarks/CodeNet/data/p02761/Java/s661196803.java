import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt(),s=0,buff=-1;
		int[] c = new int[5];
		for(int i=0;i<m;i++) {
			s=sc.nextInt();
			buff=sc.nextInt();
			if(c[s-1]!=0&&c[s-1]!=buff) {
				System.out.println(-1);
				System.exit(0);
			}
			c[s-1]=buff;
		}
		String res="";
		for(int i=0;i<n;i++) {
			res+=c[i];
		}
		if(res.charAt(0)=='0'&&n!=1) {
			System.out.println(-1);
		}else {
			System.out.println(res);
		}
	}
}

