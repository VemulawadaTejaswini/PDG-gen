import java.util.Scanner;

class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int red = 0;
		int blue = 0;

		while((blue + red) < n){
			for(int i = 0; i < a; i++){
				blue++;
			}
			for(int j = 0; j < b; j++){
				red++;
			}
		}
		System.out.println(blue);
	}
}