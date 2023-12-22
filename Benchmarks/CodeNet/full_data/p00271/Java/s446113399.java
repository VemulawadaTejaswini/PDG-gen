import java.util.Scanner;
public class Main {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,max,min;
		for(i = 0; i <=6; i++){
			max = sc.nextInt();
			min = sc.nextInt();
			System.out.println(max-min);
		}

	}

}