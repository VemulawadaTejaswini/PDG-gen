import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();

		int max = 0;
		int temp = 0;
		for(int i=0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'R'){
				temp++;
			} else {
				if(max < temp){
					max = temp;
					temp = 0;
				}
			}
		}
		if(max < temp){
			max = temp;
		}
		System.out.println(max);
	}

}