import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int tsum = 0;
			int hsum = 0;
			for(int i=0; i<n; i++) {
				String taro = sc.next();
				String hanako = sc.next();
				
				if(taro.equals(hanako)) {
					tsum++;
					hsum++;
				}else if(taro.compareTo(hanako) > 0) {
					tsum += 3;
				}else {
					hsum += 3;
				}
				
			}
			System.out.printf("%d %d",tsum,hsum);
			System.out.println("");
			
		}
	}
}
