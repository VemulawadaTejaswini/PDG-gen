import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[2];
		
		for(int i = 0; i < 2; i++)
			for(int j = 0; j < 4; j++)
				x[i] += sc.nextInt();
		
		System.out.println(Math.max(x[0], x[1]));
		
		sc.close();
	}
}