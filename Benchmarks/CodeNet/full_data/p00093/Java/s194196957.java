import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a > b || (a <= 0 && b == 0) || b >= 3000) break;
			int count = 0;
			for(int i = a; i <= b; i++){
				if(i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)){
					System.out.println(i);
					count++;
				}
			}
			if(count == 0) System.out.println("NA");
			System.out.println();
		}
	}
}