import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long  n = sc.nextLong();
		long[] x = new long[5]; 
		long min = 0;
		for(int i = 0;i < 5;i++){
			x[i] = sc.nextLong();
			if (i == 0){
				min = x[i];
			}
			if (x[i] < min){
				min = x[i];
			}
		}

		if (n == min){
			System.out.println(5);
		}else{
			System.out.println(5 + n / min);
		}
	}
}