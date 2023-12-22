
public class Main {
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner (System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			int temp = 0;

			if(a > b){
				temp = a;
				a = b;
				b = temp;
			}
			if(b > c){
				temp = b;
				b = c;
				c =temp;
			}
			if(a > b){
				temp = a;
				a = b;
				b = temp;
			}
			System.out.println(a + "" + b + "" + c);
	}
}