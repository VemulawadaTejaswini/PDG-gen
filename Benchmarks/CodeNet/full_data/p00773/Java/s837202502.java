import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNextInt()) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int s = sc.nextInt();
				if(x==0 && y==0 && s==0) break;
				
				int max=0;
				for(int i=1;i<s;i++) {
					for(int j=1;i+j<=s;j++) {
						if(i*(100+x)/100 + (j)*(100+x)/100 == s) {
							int sum =i*(100+y)/100 + (j)*(100+y)/100;
							if(sum>max) max=sum;
						}
					}
				}
				System.out.println(max);
			}
		}
	}
}


