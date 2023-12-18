import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int f=0;
		
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i*j==a) {
					System.out.println("Yes");
					f=1;
				}else {
					if(i==9&&j==9&&f==0) {
						System.out.println("No");
					}
				}

			}

		}

 
		sc.close();
	}
}