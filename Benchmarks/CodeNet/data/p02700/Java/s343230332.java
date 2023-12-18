import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int HP_Takahashi = A;
		int attack_Takahashi = B;
		int HP_Aoki = C;
		int attack_Aoki = D;
		while(HP_Takahashi <= 0 || HP_Aoki <= 0){
			HP_Takahashi -= attack_Aoki;
			HP_Aoki -= attack_Takahashi;
		}
		if (HP_Takahashi <= 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		} 
	}
}