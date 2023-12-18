import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int n = 0;
		for(int i=x/y; 0<=i; i--){
			if(x > y * i + z * (i+1)){
				n = i;
				break;
			}
		}
		System.out.println(n);
	}
}
