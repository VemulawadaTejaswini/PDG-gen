import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		int n,x;
		int max = -1000000;
		int min = 1000000;
		long sum = 0;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		sc.hasNext();

		for(int i=0;i<n;i++){
			x = sc.nextInt();
			if(min > x){
				min = x;
			}
			if(x > max){
				max = x;
			}
			sum += x;
		}

		System.out.println(min +" "+ max +" "+ sum);
		sc.close();
	}

}