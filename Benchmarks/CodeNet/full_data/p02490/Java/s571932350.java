import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		Scanner scanner = new Scanner(System.in);
		while(true){
			x = scanner.nextInt();
			y = scanner.nextInt();
			if( x==0 && y==0){
				break;
			}
			else if (x<y){ 
				System.out.println(x+" "+y);
			}
			else if (x>=y){
				System.out.println(y+" "+x); 
			}
		}
	}
}