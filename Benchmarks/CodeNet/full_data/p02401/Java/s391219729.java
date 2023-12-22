import java.util.Scanner;	//Scannerクラス：Java標準入力を取得する

class Main {
	public static void main(String[] args){		//メソッド宣言
		try(Scanner sc = new Scanner(System.in)){
			for(;;) {
				int a = sc.nextInt();
				String op = sc.next();
				int b = sc.nextInt();
				int ans = 0;
				
				if(op.equals("?")) {
					break;
				}else if(op.equals("+")) {
					ans = a + b;
				}else if(op.equals("-")) {
					ans = a - b;
				}else if(op.equals("*")) {
					ans = a * b;
				}else if(op.equals("/")) {
					ans = a / b;
				}

				System.out.println(ans);
			}
		}
	}
}

