import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i,l,n,sum;
		String str;
		sum = 0;
		Scanner sc= new Scanner(System.in);
		while(true){
			str = sc.nextLine();
			n = Integer.parseInt(str);
			if(n == 0) break;
			l = str.length();
			for(i = 0; i < l; i++){
				sum += (str.charAt(i) - '0');
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}