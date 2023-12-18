import java.util.Scanner;

public class Main {
	static String ans="Yay!";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Map<Long,Integer>map=new HashMap<>();
		int n=5;
		int sum=0;int rim=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%10==0)sum+=a[i];
			else {
				rim=Math.max(rim,10-(a[i]%10));
				sum+=10-(a[i]%10)+a[i];
			}
		}
		System.out.println(sum-rim);
	}
}
