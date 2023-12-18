import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(), k = scanner.nextInt();
		int result = 1;
		for(int i=0;i<n;i++){
			if(result * 2 < result + k){
				result *= 2;
			}else{
				result += k;
			}
		}
		System.out.println(result);
	}

}
