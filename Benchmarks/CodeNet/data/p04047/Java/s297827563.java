import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int[] l=new int[n*2];
			for(int i=0;i<2*n;i++) l[i]=sc.nextInt();
			Arrays.sort(l);
			int ans=0;
			for(int i=0;i<2*n;i+=2) ans+=l[i];
			System.out.println(ans);
		}
	}
}