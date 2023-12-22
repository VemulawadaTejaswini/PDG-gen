import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true){
			int m = scanner.nextInt();
			int f = scanner.nextInt();
			int r = scanner.nextInt();

			int a = m+f;//コードを短くするため変数aを作る
			if((a+r) <= -3){//終了条件の明記
				break;}
			if((m == -1)||(f == -1)){//－１が出た時点でF
				System.out.println("F");
			}
			else if(a >= 80){
				System.out.println("A");
			}
			else if(a >=65){
				System.out.println("B");
			}
			else if((a >=50)||(r >=50) ){
				System.out.println("C");
			}
			else if(a >=30){
				System.out.println("D");
			}
			else if(a < 30){
				System.out.println("F");
			}
		
		}
		scanner.close();
	}
}


