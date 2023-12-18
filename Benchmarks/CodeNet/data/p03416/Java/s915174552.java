import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = a; i < b; i++){
			int digit = String.valueOf(i).length();
			boolean bool = true;
			for(int j = 0; j <= digit/2; j++){
				if(!(bool = (i / 10000 == i % 10) && ((i / 1000) % 10 == (i / 10) % 10))) break;
			}
			if(bool) {
				//System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
	}
}