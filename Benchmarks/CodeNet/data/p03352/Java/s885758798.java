import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int x, a, b, c;
		int n = 1;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if(x == 1){
			System.out.print(1);
			return;
		}
		for(int i = 2; i < x; i++){
			b = i;
			for(int j = 0; b < x; j++){
				b *=b;
			}
			if(n < b){
				n = b;
			}
		}
		System.out.print(n);
	}
}