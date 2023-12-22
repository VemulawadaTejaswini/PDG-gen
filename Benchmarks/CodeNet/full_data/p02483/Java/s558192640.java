import java.util.Scanner;
class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] x = new int[3];
		int tmp;
		for (int i = 0; i < 3; i++){
			x[i] = input.nextInt();
		}
		for (int i = 0; i < 2; i++){
			if (x[i] > x[i + 1]){
				tmp = x[i];
				x[i] = x[i + 1];
				x[i + 1] = tmp;
			}
		}
		
		System.out.printf("%d %d %d\n", x[0], x[1], x[2]);
		
		input.close();
	}
}