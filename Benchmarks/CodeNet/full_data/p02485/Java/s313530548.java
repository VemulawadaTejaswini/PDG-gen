import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;
		int sum;
		while(true){
			str = sc.next();
			sum = 0;
			if(Integer.parseInt(str) == 0)
				break;
			else
				for(int i = 0; i < str.length(); i++)
					sum += str.charAt(i) - '0';
			System.out.println(sum);
		}
	}
}