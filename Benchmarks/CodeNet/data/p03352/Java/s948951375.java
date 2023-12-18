import java.util.Scanner;

class Main{
	public static void main(String args[]){
		int x, a, b, c;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		for(int i = 2;i < x;i++){
			b = i;
			for(int j = 0;b < x;j++){
				b *=b;
				if(b == x){
					System.out.print(b);
				}
			}
		}
		System.out.print(1);
	}
}