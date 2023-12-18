import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] t=new int[n];
		
		for (int j=0;j<n;j++) {
			t[j]=sc.nextInt();
			
		}
		
		int m=n-1,sum=0;
	
		
		while(m>1) {
			int t1=abs(t[m],t[m-1]);
			int t2=abs(t[m],t[m-2]);
			if(t1<t2) {
				
				m=m-1;
				sum+=t1;
				
			}else {
				m=m-2;
				sum+=t2;
			}
		
			
		}
		if(m==1) {
			sum+=abs(t[1],t[0]);
			
		}
		
		
		System.out.println(sum);

	}
	public static int abs(int b,int c) {
		
		if(b-c>=0) {
			return b-c;
		} else
		
		return c-b;
		
	}
	

}
