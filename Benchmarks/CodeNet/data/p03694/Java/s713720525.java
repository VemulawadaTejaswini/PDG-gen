import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[101];
		int max=0,min=1000;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]<min)		min=a[i];
			if(a[i]>max)		max=a[i];
		}
		System.out.println(max-min);
	}

}