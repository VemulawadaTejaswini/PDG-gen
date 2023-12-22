import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int sum = 0;
			if(n == 0 ) break;
			for (int i = 0 ; i < n ;i++){
				int a = sc.nextInt();
				if(a >= 0) sum +=a ;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}