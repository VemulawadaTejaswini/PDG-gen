public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt;
		int op = scan.nextInt;
		int b = scan.nextInt;//????????¶??\???
		if(op == "?"){
			break;
		} else if(op == "+") {
			int x = a + b;
		} else if(op == "-") {
			x = a - b;
		} else if(op == "*") {
			x = a * b;
		} else if(op == "/") {
			x = a / b;			
		}
		System.out.println(x);
	}
}