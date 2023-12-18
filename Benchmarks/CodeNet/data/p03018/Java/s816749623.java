import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		String str=sc.next();

		sc.close();

		int cnt=0;

		while(true){

			if(!str.contains("ABC")) break;
			else{
				str=str.replaceFirst("ABC", "BCA");
				cnt++;
			}

			//System.out.println(str);

		}

		System.out.println(cnt);

	}

}
