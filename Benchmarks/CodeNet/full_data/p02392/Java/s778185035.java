import java.util.Scanner;

public class Main {
	private void calc(){
		Scanner scanner = new Scanner(System.in);
		int x =scanner.nextInt();
		int y =scanner.nextInt();
		int z =scanner.nextInt();
		if(x<y && y<z){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	
	public static void main(String[] args) {
		Main run =new Main();
		run.calc();

	}
}