import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p[]=new int[n];
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		int count=0;
		sc.close();
		for(int j=1;j<(n-1);j++) {
			if(p[j-1]<p[j]&&p[j]<p[j+1]) {
				count++;
			}else if(p[j-1]>p[j]&&p[j]>p[j+1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}