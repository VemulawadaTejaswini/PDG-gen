import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int a[] = new int[5];
		int x;
		for(int i = 0;i<5;i++){
			a[i] = scn.nextInt();
		}
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				if(a[j] < a[j+1]){
					x = a[j];
					a[j] = a[j+1];
					a[j + 1] = x;
				}
			}
		}
		for(int i = 0;i<5;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
}