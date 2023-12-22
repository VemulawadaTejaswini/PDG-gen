import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long n;
		while((n = scan.nextLong()) != 0) {
			for(int i = 1 ; i <= n ; i++) {
				String numString = String.valueOf(i);
				char num[] =numString.toCharArray();
				
				
				for(int j = 0 ; j < num.length ; j++) {
					if(num[j] == '4' || num[j] == '6') {
						n += Math.pow(10,num.length-1-j);
						i += Math.pow(10,num.length-1-j)-1;
						break;
					}
				}
			}
			System.out.println(n);
		}
	}

}

