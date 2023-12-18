import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] height = new int[n];
		for(int i=0;i<n;i++) {
			height[i]=sc.nextInt();
		}
		int[] count=new int[n];
		for(int j=0;j<m;j++) {
			int a=sc.nextInt(),b=sc.nextInt();
			if(height[a-1]>height[b-1]) count[b-1]=0;
			else count[a-1]=1;
		}
		int c=0;
		for(int i=0;i<n;i++) {
			if(count[i]==1)  c++;
		}
		System.out.println(c);
	}
}