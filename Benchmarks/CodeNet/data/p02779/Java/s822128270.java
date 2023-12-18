import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] a=new int[1000000000];
		int count=0,flag=0;
		for(int i=0;i<n;i++) {
			count=sc.nextInt();
			a[count-1]++;
			if(a[count-1]>1) {
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
