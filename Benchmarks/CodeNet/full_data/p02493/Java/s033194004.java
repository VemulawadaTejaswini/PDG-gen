import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idx = in.nextInt();
		int a[]  = new int [idx];
		for(int i = 0; i < idx; i++){
			a[i] = in.nextInt();
		}
		for(int i = idx - 1; i >= 0; i--){
			System.out.print(a[i]);
			if(i != 0){
				System.out.print(" ");
			}
			else{
				System.out.println();
			}
		}
	}

}