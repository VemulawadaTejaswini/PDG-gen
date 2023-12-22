public class Main {
	public static void main(String[] args) throws IOException{
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = Integer.parseInt(scan.next());
		String op = scan.next();
		int b = Integer.parseInt(scan.next());
		//String op = scan.nextLine();


		if("+".equals(op)){
			System.out.println(a + b);
		}else if("-".equals(op)){
			System.out.println(a - b);
		}else if("*".equals(op)){
			System.out.println(a * b);
		}else if("/".equals(op)){
			System.out.println(a / b);
		}else if("?".equals(op)){
		}

	}

}