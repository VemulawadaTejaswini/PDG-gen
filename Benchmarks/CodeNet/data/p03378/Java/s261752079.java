import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);	
		int n= stdin.nextInt();
		int m= stdin.nextInt();
		int x= stdin.nextInt();
		int up=0;
		int down=0;
		int num=0;
		for(int i=0;i<m;i++) {
			num = stdin.nextInt();
			if(num>x) {
				up++;
			}else {
				down++;
			}
			
		}
		if(up<down) {
			System.out.println(up);
		}else {
			System.out.println(down);
		}

		
		


	}

}
