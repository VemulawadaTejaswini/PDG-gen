import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int count = 0;
			int n = sc.nextInt();
			if(n == 0) break;
			int num = 2;
			int sum = 0;
			while(n != count){
				for (int j = 2 ; j <= num  ; j++){
					if(num == j){
						count++;
						sum += j;
					}else if(num % j == 0){
						break;
					}
				}
				num++;
			}
			System.out.println(sum);
		}
		sc.close();
	}
}