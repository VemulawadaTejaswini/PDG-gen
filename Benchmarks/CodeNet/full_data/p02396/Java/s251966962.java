import java.util.Scanner;

class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int i = 1;
		int x;
		while(true){
			Scanner scan = new Scanner(System.in);
			x = scan.nextInt();
			if(x == 0)break;
			System.out.println("Case " + i + ":" + x);
			i++;
		}
i = 0;
x = 0;
	}
}