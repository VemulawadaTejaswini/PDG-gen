import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		if (1<=A&&A<=100 &&1<=B&&B<=100 &&1<=C&&C<=100 &&1<=D&&D<=100 ){
		}
		else{
			throw new IllegalArgumentException("不適切な数値です。");
		}
		int HP_Takahashi = A;
		int attack_Takahashi = B;
		int HP_Aoki = C;
		int attack_Aoki = D;
		while(HP_Takahashi > 0 && HP_Aoki > 0){	
			HP_Aoki -= attack_Takahashi;
			HP_Takahashi -= attack_Aoki;
		}
		if (HP_Takahashi > 0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		} 
	}
}