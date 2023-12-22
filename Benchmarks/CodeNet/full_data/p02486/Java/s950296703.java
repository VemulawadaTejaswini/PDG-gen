import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int x = sc.nextInt();
			if(n == 0)
				break;
			int a = 0, i, j, k;
			for(i = 1; i <= 7; i++){
				for(j = i + 1; j <= 8; j++){
					for(k = j + 1; k <= 9; k++){
						if(i + j + k == 9)
							a++;
					}
				}
			}
			System.out.println(a);
		}
	}
}