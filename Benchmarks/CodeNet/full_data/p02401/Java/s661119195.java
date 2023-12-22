import java.util.Scanner;
class Main {
	int a,b;
	String op;
	public void si() {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		while(sw == true) {
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
			if(op.equals( "+" )){
				System.out.println(a + b);
			} else if(op.equals ( "-" )) {
				System.out.println(a - b);
			} else if(op.equals ( "*" )) {
				System.out.println(a * b);
			} else if(op.equals ( "/" ) ) {
				if(b > 0) {
					System.out.println(a / b);
				}
			} else if(op.equals( "?" )) {
				sw = false;
			}
		}
	}
	public static void main(String[] args){
		new Main().si();
	}
}