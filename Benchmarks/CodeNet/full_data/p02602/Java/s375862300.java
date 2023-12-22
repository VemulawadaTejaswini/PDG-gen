import java.util.Scanner;
public class Main {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int ar[]=new int[n];
	int i;
	int sum=1;
	int last=0;
	for(i=0;i<n;i++) {
		ar[i]=sc.nextInt();
	}
	
		for(i=0;i<n-k;i++) {
			if(ar[i]<ar[i+k]) {
				System.out.println("Yes");
			}else if(ar[i]>=ar[i+k]) {
				System.out.println("No");
			}
		}
		
		
		
	
	
}
}