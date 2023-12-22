import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = null;
		String[] item = new String[3];
		int a, b;
		while(true){
			str = scan.nextLine();
			item = str.split(" ");
			a = Integer.parseInt(item[0]);
			b = Integer.parseInt(item[2]);
			if(item[1].equals("?")){
				break;
			}
			switch(item[1]){
				case "+":
					System.out.println( a + b );
					break;
				case "-":
					System.out.println( a - b );
					break;
				case "*":
					System.out.println( a * b );
					break;
				case "/":
					System.out.println( a / b );
					break;

			}
		}
	}
}
