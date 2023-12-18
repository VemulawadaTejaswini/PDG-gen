import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		int fivecount = 0;
		int sevencount = 0;
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 3; i++){
			int a = scan.nextInt();
			if(a == 5){
				fivecount ++;
			}
			if(a == 7){
				sevencount ++;
			}
		}
		if(fivecount == 2 && sevencount == 1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}