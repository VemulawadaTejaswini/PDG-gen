import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = 0;
		for(int i = 1;i <= a;i++){
			x = i / 10000 + ((i % 10000) / 1000) + ((i % 1000) / 100) + ((i % 100) / 10) + (i % 10);
		}
		System.out.println(x);
	}
}