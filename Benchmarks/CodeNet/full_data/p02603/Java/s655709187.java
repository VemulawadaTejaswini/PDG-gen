import java.util.Scanner;
public class Main {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int ar[]=new int[n];
	int i;
	int sum=1000;
	int count=0;
	for(i=0;i<n;i++) {
		ar[i]=sc.nextInt();
	}
	for(i=0;i<n-1;i++) {
		if(ar[i]<ar[i+1]) {
			count=sum/ar[i];
		}else if(ar[i]>ar[i+1]) {
			sum=ar[i]*count;
		}
	}
	System.out.println(sum);
}
}
