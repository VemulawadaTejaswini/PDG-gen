import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
 		int n = scan.nextInt();
		String S = scan.next();
		int a[] = new int[n];
		int x[] = new int[n];
		int y[] = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = S.substring(i, i+1).equals("W") ? 0:1;
		}



		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			int minj = 0;
			for(int j=0;j<i;j++){
				if(a[j]==0){
					minj += 1;
				}
			}
			for(int j=i+1;j<n;j++){
				if(a[j]==1){
					minj += 1;
				}
			}

			min = Math.min(minj,min);
		}

		System.out.println(min);
	}
 
}