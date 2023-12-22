import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			int ans = 0;
			for(int x = 1; x <= i; x ++){
				for(int y = 1; y <= i; y++){
					for(int z = 1; z <= i; z++){
						if(((x * x) + (y * y) + (z * z) + (z * y) + (x * z) + (y * x)) == i){
							ans ++;
							break;
						}
					}
				}
			}
			System.out.println(ans);
		}
	}

}
