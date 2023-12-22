import java.util.*;
public class Main {

	public static void main(String[] args) {
		for(int i = 0;;i++){
			int counter = 1;
			counter++;
			Scanner sc = new Scanner (System.in);
			int x = sc.nextInt();
			if(x == 0) {
				break;
			}
			System.out.println("Case "+ counter +": "+ x);
		}

	}

}