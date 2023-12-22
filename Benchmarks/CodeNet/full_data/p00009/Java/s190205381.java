import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, pcount = 0;
		
		while(sc.hasNext()){
			pcount = 0;
			n = sc.nextInt();
			
			for(int i = 2; i <= n; i++){
				for(int j = 2; j <= i; j++){
					if(i == j) pcount++;
					if(i % j == 0) break;
				}
			}
			System.out.println(pcount);
		}
	}
}