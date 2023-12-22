import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int i, j;
		int data[] = new int[10000];
		for(i = 1; i <= 10000; i++){
			Scanner sc = new Scanner(System.in);
			data[i] = sc.nextInt();
			if(data[i] == 0) break;
		}
		for(j = 1; j < i; j++){
			System.out.println("Case " + j + ": " + data[j]);
		}
	}
}