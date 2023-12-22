import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdn = new Scanner(System.in);

		int a = stdn.nextInt();
		int b = stdn.nextInt();
		int c = stdn.nextInt();
		int flg = 0;
		
		for( ; a <= b; a++){
			if(c % a == 0){
				flg++;
			}
		}
		System.out.println(flg);
	}
}