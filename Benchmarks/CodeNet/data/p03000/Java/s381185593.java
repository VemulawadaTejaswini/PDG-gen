


import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),X=sc.nextInt();
		int[] L=new int[N];
		
		for(int i=0;i<N;i++) {
			L[i]=sc.nextInt();
		}
		
		int zahyo=0;
		int count=1;
		
		for(int i=0;i<N;i++) {
			zahyo+=L[i];
			if(zahyo>X) {
				break;
			}else {
				count++;
				
			}
			
		}
		
		System.out.println(count);
		
		
	}
}


