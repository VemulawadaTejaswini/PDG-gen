import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a=new int[100000000];
		int[] b=new int[100000000];
		int count=0,flag=0;
		for(int i=0;i<n;i++) {
			count=sc.nextInt();
			if(count>100000000) {
				b[count%100000000]++;
				if(b[count%100000000]>1) {
					flag=1;
				}
			}else {
				a[count-1]++;
				if(a[count-1]>1) {
					flag=1;
				}
			}
		}
		if(flag==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
