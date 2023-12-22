import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] a=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		
		for(int i=0;i<n;i++){
			System.out.printf("node %d: key = %d, ",i+1,a[i]);
			if(i!=0){
				if(i%2==0)
					System.out.printf("parent key = %d, ",a[i/2-1]);
				else
					System.out.printf("parent key = %d, ",a[i/2]);
			}
			if(i*2+1 < n)
				System.out.printf("left key = %d, ",a[i*2+1]);
			if(i*2+2 < n)
				System.out.printf("right key = %d, ",a[i*2+2]);
			System.out.println();
		}
		
	}
}
