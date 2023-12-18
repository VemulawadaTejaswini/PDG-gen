import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = scan.nextInt();
		}
		float baisu = 1;
		for(int i = 0; i < n; i++){
			baisu = baisu * array[i];
		}
		float bosu = 0;
		for(int i = 0; i < n; i++){
			bosu = bosu + baisu/array[i];
		}
		float result = baisu/bosu;
		System.out.println(result);
	}
}