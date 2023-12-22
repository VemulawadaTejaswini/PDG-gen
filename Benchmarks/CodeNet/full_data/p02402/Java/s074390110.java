import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, n, max = 0, min = 100000, sum = 0;
		x = sc.nextInt();
		for(int i = 0; i < x; i++){
			n = sc.nextInt();
			sum += n;
			if(n > max){
				max = n;
			}
			if(n < min){
				min = n;
			}
		}
		System.out.println(min + " " + max + " "+ sum);
		sc.close();
	}
}

