import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		for(int i = 1;i <= n;i++){
			int x = i;
			if(x % 3 == 0 || x % 10 == 3){
				System.out.print(" "+i);
				continue;
			}else{
				for(x /= 10;x != 0;x /= 10){
					if(x % 10 == 3)
						System.out.print(" "+i);
						break;
				}
			}
		}
		
		System.out.print("\n");
		
		sc.close();
	}
}