import java.util.Scanner;

public class Itp15D{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int flg = 0;

		while(true){
			int x = i;
			if(x % 3 == 0){
				System.out.println(i);
				i++;
				if(i <= n){
					i++;
					continue;
				}else{
					break;
				}
			}

			while(true){
				if(x % 10 == 3){	
					System.out.println(i);	
					i++;
					if(i <= n){
						i++;
						break;
					}
				}
				x = x / 10;
				if(x == 0){
					i++;
					break;
				}
			}

		}

	}
}
