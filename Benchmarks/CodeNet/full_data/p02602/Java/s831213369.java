import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] line=sc.nextLine().split(" ");
		
		int n=Integer.parseInt(line[0]);//
		int k=Integer.parseInt(line[1]);//

		
		String[] line1=sc.nextLine().split(" ");
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=Integer.parseInt(line1[i]);
		}
		
		long[] count=new long[n-k+1];
		for(int i=0;i<count.length;i++) {
			count[i]=1;
		}
		
		for(int i=0;i<count.length;i++) {	
			for(int m=0;m<k;m++) {
				count[i]=count[i]*num[i+m];
			}
		}
		
		for(int i=1;i<count.length;i++) {	
			if(count[i]>count[i-1]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	
	
		
		
	}

}
