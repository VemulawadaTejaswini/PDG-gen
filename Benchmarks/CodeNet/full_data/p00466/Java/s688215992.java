import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] total;
		while(true) {
		total = new int[10];
		for(int i = 0 ; i < 10 ;i++){
			total[i] = sc.nextInt();
		}
		if(total[0] == 0) break;
		for(int i = 1 ; i < total.length ; i++){
			total[0] -= total[i];
		}
		System.out.println(total[0]);
		}
		sc.close();
	}

}