import java.util.Scanner;
class Main{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int tate = sc.nextInt();
		int yoko = sc.nextInt();
		int men;
		int syu;
		men = tate * yoko;
		syu = tate * 2 + yoko * 2;
		System.out.println(men+" "+syu);
		sc.close();
	}
}