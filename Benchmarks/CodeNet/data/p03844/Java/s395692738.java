public class Main {
	public static void main(String[] args){
		int a = new java.util.Scanner(System.in).nextInt();
		String op = new java.util.Scanner(System.in).nextLine();
		int b = new java.util.Scanner(System.in).nextInt();
		if(op.equals("+")){
			System.out.println(a+b);
		}else{
			System.out.println(a-b);
		}
	}
}
