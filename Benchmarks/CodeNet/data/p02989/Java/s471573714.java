import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int n2=n/2;
	int a[]=new int[n];
	for(int i=0;i<n;i++){
a[i]=sc.nextInt();
	}
Arrays.sort(a);

	System.out.println(a[n2]-a[n2-1]);


	}}