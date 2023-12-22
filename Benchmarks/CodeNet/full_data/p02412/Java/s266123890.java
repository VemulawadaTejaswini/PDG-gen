import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int n = sc.nextInt();
				int x = sc.nextInt();
				if(n==0&&x==0) break;

				int num = 0;
				for(int i=1;i<=x/3;i++) {
					for(int j = i+1;j<=x/2;j++) {
						for(int k = j+1;k<=n;k++) {
							if((i+j+k)==x)
								num++;
						}
					}
				}
				System.out.println(num);
			}
		}
	}
}
