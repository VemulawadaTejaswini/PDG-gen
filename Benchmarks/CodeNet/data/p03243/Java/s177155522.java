import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//String string = scanner.next();
		int N = scanner.nextInt();
		
		for(int i = N;i < 1000;i++){
			if(i == 111 ||i == 222 || i == 333 ||i == 444 ||i == 555 ||i == 666 ||i == 777 ||i == 888 ||i == 999){
				System.out.println(i);
				return;
			}
		}
	}
}

