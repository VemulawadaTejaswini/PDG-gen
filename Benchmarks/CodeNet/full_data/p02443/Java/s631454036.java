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
			
			int b = sc.nextInt();
			int e = sc.nextInt();
			
			for(int j=0;j<(e-b)/2;j++) {
				int tmp = List[b + j];
				List[b + j] = List[e - j-1];
				List[e - j-1] = tmp;
			}
		}
		
		for(int i=0;i<List.length;i++) {
			System.out.print(List[i]);
			if(i != List.length - 1)
				System.out.print(" ");
			else
				System.out.println();
		}
	}
}
