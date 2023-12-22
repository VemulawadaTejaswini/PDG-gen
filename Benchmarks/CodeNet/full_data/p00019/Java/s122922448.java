import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	
		int y=1;
		if(x>=0&&x<21){
		for(int i=1;i<x;i++){
			y=i*y;
		}
		System.out.print(y*x);
		}
	}
}