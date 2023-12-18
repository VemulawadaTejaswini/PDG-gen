import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int count = 0;
		for (int i = 0; i < 4; i++) {
		    int number = input % 10;
		    if (number == 2) {
		        count++;
		    }
		    input /= 10;
		}
        System.out.println(count);
	}
}