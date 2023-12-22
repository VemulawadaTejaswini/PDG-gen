import java.util.Scanner;
public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int tHP = sc.nextInt();
		int tAt = sc.nextInt();
		int aHP = sc.nextInt();
		int aAt = sc.nextInt();


		while(true){
			aHP -= tAt;
			tHP -= aAt;
			if(aHP <= 0){
				System.out.print("Yes");
				return;
			}
			if(tHP <= 0){
				System.out.print("No");
				return;
			}
		}

	}
}
