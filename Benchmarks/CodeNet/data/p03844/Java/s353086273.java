import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int op = sc.next();
		int b = sc.nextInt();
		if(op=="+"){
			System.out.println(a+b);
		}else{
			System.out.println(a-b);
		}
	}
}