import java.util.Scanner;
import java.io.*;

class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();
		//int a = Integer.MAX_VALUE;
		int max =Math.max(X, Y);
		long temp;
		long money = A*X + B*Y;
		//System.out.println(money);
		for(int i = 1;i <= max;i++){
			if(Y <= i) Y = i;
			if(X <= i) X = i;
			temp = A*(X-i) + B*(Y-i) + 2*C*i;
			//System.out.println(temp);
			if(money > temp) money = temp;
			//System.out.println(i);
		}

		System.out.println(money);
		//System.out.println(a);
	}
}