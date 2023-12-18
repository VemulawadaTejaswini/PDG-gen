import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int sum = 0;
		int time = 0;
		
		while(sum<x) {
			time += 1;
			sum += time;
		}
		
		System.out.println(time);
	}

}
