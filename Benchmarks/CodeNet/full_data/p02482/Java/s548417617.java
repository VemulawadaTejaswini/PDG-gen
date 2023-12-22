import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		try{String line1 = scanner.next();
			String line2 = scanner.next();
			int a =Integer.parseInt(line1);
			int b =Integer.parseInt(line2);
			if(a>b)
				System.out.println("a>b");

			else if(a<b)
				System.out.println("a<b");

			else if(a==b)
				System.out.println("a=b");

			scanner.close();

		}
		 	catch (NumberFormatException e) {
			 System.out.println("??°????????¢????????£????????????????????????");
			 }


	}

}