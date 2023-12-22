import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				int m=sc.nextInt();
				int n=sc.nextInt();
				if(n+m==0) break;
				boolean can = false;
				
				int[] book = new int[n+1];
				for(int i=1;i<=n;i++) {
					book[i] = sc.nextInt();
				}
				
				
				int sum = 0;
				for(int i=1;i<=n;i++) {
					sum += book[i];
					int[] sumeach= new int[m+1];
					for(int k=1;k<=m;k++) {
						sumeach[k] = 0;
					}
					
					int h = m;
					
					for(int j=1;j<=n;j++) {
						if(sumeach[h]+book[i] >sum) {
							
							if(h==1)break;
							else h--;
						}
						sumeach[h] += book[i];
						if(j==n) can = true;
					}
					if(can) break;
				}
				System.out.println(sum);
			}

		}
		
	}
}

