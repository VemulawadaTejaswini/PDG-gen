import java.util.Scanner;
class Main {
	public void how() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int z = 0;
		for(int I = a ; I <= b ; I++) {
			int x = c % I;
			if(x == 0) {
				z++; 
			}
		}
		System.out.println(z);
	}
	public static void main(String[] args) {
		new Main().how();
	}
}