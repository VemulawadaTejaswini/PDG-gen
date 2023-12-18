import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] a=new int[N];
		
		for(int i=0;i<N;i++) {
			a[i]=sc.nextInt();
		}
		
		int count=0;
		
		for(int i=0;i<N;i++) {
			if(a[i]==1) {
				count+=1;
			}
		}
		if(count!=0) {
			
			System.out.println(count);
			
			int counter=0;
			
			while(counter==0) {
		
				for(int i=0;i<N;i++) {
					if(a[i]!=0&&a[i]!=1) {
						System.out.println(-1);
						break;
					}
				}
					
				
				for(int j=0;j<N;j++) {
					if(a[j]==1) {
						System.out.print(j+1+"\t");
					}else if(a[j]==0) {
					
					}
				}
				counter++;
			}
		}else {
			System.out.println(0);
		}
		
		sc.close();
	}
}