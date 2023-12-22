import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] List = new int[n];
		
		for(int i=0;i<n;i++) 
			List[i] = sc.nextInt();
		
		int q = sc.nextInt();
		
		for(int i=0;i<q;i++) {
			int count = 0;
			int b = sc.nextInt();
			int e = sc.nextInt();
			int k = sc.nextInt();
			
			for(int j=b;j<e;j++) 
				if(List[j] == k) count++;
			
			System.out.println(count);
		}
		
	}
}
