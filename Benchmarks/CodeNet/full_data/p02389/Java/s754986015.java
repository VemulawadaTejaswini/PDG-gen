import java.util.Scanner;
class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int tate, yoko;
		tate = scan.nextInt();
		yoko = scan.nextInt();
		
		tate = tate * yoko;
		yoko = tate * 2 + yoko * 2;
		
		System.out.print(tate + " ");
		System.out.println(yoko);
	}
}