import java.util.Scanner;
class Main {
    public void kami() {
        		Scanner sc = new Scanner(System.in);
		int x = 0;
		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		
		while(!op.equals("?")){
			if(op.equals("+")){
				x = a + b;
				System.out.println(x);
			}else if(op.equals("-")){
				x = a - b;
				System.out.println(x);
			}else if(op.equals("*")){
				x = a * b;
				System.out.println(x);
			}else if(op.equals("/")){
				x = a / b;
				System.out.println(x);
			}
			a = sc.nextInt();
			op = sc.next();
			b = sc.nextInt();
		}

    }
	public static void main(String[] args) {
    new Main().kami();
	}

}