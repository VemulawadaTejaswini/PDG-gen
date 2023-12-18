import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();//a
		int b = sc.nextInt();//b
		int small = 0, lerge = 0;
		if(a >= b) {
			lerge = a;
			small = b;
		}else{
			lerge = b;
			small = a;
		}
		for(int i = 0; i < lerge; i++) {
			System.out.print(small);
		}
		System.out.println();
	
		
		sc.close();
	}

}
