import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int res =0;
		for(int i =1; i < Math.pow(10,6);i++) {
			for(int j =i+1; j < Math.pow(10,6);j++) {
				if(i+j == n) {
					res++;
				}else if(i+j >= n) {
					break;
				}
				
			}

			
		}
		System.out.println(res);

	}

}