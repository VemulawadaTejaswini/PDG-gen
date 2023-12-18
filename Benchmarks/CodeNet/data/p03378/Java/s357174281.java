import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int x=sc.nextInt();
		int[] a=new int[m];
		int l=0;
		int r=0;
		for(int i=0;i<m;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			if(a[i]==x) {
				r=m-l-1;break;
			}
			else if(a[i]>x) {
				r=m-l;
				break;
			}
			l++;			
		}
		System.out.println(Math.min(r, l));
		
	}

}
