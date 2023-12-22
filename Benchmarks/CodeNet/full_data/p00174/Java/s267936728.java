
import java.util.Scanner;

public class Main {

	private void doIt() {
		Scanner sc = new Scanner(System.in);
		while(true){
			String input = sc.next();
			if(input.equals("0"))
				break;
			int len = input.length();
			int a = 0,b=0;
			for(int i =1; i < len; i++){
				char now = input.charAt(i);
				if(now == 'A'){
					a++;
				}
				else{
					b++;
				}
			}
			if(a > b){
				a++;
			}
			else{
				b++;
			}
			System.out.println(a + " " + b);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}