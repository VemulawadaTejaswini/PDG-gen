import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int i = 1;
			do {
				int x = i;
				if(x%3 == 0){
					System.out.println(" "+i);
				}else{
					do{
						if(x%10 == 3){
							System.print(" "+i);
							break;
						}
						x /= 10;
					}while(x != 0);
				}
			}while(++i <= n);
			System.out.println();
		}
	}
}