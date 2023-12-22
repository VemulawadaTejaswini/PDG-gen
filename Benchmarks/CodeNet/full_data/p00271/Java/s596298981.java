import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int a[] = new int [8];
	int b[] = new int [8];
	int c[] = new int [8];
	int A;

	public void nyu(){
		for(A=0;A<7;A++){
			
			a[A] =sc.nextInt();
		}

		for(A=0;A<7;A++){
			
			b[A] = sc.nextInt();
		}
	}
	public void hiki(){
		for(A=0;A<7;A++){
			c[A]=a[A] - b[A];
			System.out.println(c[A]);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Main main = new Main();
		main.nyu();
		main.hiki();
	}

}