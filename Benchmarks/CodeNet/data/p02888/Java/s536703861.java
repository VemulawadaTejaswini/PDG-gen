import java.util.Scanner;


	public class Main {
		
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			int[] r = new int[n];
			
			for(int i=0;i<n;i++) {
				r[i] = sc.nextInt();
			}
			
			int ret = 0;
			
			for(int a=0;a<n-2;a++) {
				for(int b = a+1;b<n-1;b++) {
					for(int c = b+1;c<n;c++) {
						if(r[a]<r[b]+r[c]&&r[b]<r[c]+r[a]&&r[c]<r[a]+r[b]) {
							ret++;
						}
					}
				}
			}
			
			System.out.println(ret);
			
	    }
		
	}
	
