import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a+b < 17 && a < 9 && b < 9)
			System.out.println("Yay!");
		else
			System.out.println(":(");
		//B
		/*
		int d = sc.nextInt();
		int n = sc.nextInt();
		System.out.println((int)Math.pow(100,d)*n);
		*/
		//C
		/*
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean[] k_flag = new boolean[n];
		for(int i = 0; i < n ; i++){
			int x = sc.nextInt();
			if(x%2 == 0) k_flag[i]=false;
			else k_flag[i] = true;
			a[i] = x;
		}
		for(int j = 0 ; j < n ; j++){
			if(a[j]%2 == 1)
				a[j] *= 3;
			else
				a[j] /= 2;
		}
		*/
		//D
	}
}
