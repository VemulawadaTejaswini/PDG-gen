import java.util.Scanner;


class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int i;
		int y = 0;
		for(int x = a; x <= b; x++){
			i = c / x;
			if(c == i * x){
				y = y + 1;
			}
		}
		System.out.println(y);
	}
}
