import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int i,j,n,q,count=0;
		n=scan.nextInt();
		int[] s=new int[n];
		for(i=0;i<n;i++) {
			s[i]=scan.nextInt();
		}
		q=scan.nextInt();
		int[] t=new int[q];
		for(i=0;i<q;i++) {
			t[i]=scan.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<q;j++) {
				if(s[i]==t[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println(count);
	}
}
