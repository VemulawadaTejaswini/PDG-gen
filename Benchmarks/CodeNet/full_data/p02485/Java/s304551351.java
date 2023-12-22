import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		int x;
		int sum;
		while(true){
			str = sc.next();
			x = Integer.parseInt(str);
			sum = 0;
			if( x == 0)
				break;
			else
				for(int i = 0; i < str.length(); i++)
					sum += str.charAt(i) - '0';
			System.out.println(sum);
		}
	}
}