import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int k = sc.nextInt();
			int one = 0;
			int ret = 0;
			
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				if(x==1) {
					one = i;
				}
			}
			
			if(one==0||one==n-1) {
				ret = (n+k-3)/(k-1);
			}else if(n-one-k>0){
				ret = (one+k-2)/(k-1)+(n-one+k-2)/(k-1);
			}else {
				ret = (one+k-2)/(k-1)+1;
			}
			
			System.out.println(ret);
		}//ret = (one/(k-1)+1)+((n-one)/(k-1)+1);

	}
