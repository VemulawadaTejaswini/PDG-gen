import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a > b || (a <= 0 && b == 0) || b >= 3000) break;
			boolean uru = false;
			int uruC = 0;
			for(int i = a; i <= b; i++){
				uru = false;
				if(i % 4 == 0) uru = true;
				if(i % 100 == 0) uru = false;
				if(i % 400 == 0) uru = true;
 				if(uru){
 					System.out.println(i);
 					uruC++;
 				}
			}
			if(uruC == 0)System.out.println("NA");
			System.out.println();
		}
	}
}