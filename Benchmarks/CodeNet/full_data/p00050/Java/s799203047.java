import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static int cnt=0;

	public static void main(String[] args) {

		while(sc.hasNext()){
			String str = sc.next();

			if(str.contains("apple")){
				str = str.replace("apple", "peach");
			} else if(str.contains("peach")){
				str = str.replace("peach", "apple");
			}

			if(cnt != 0) System.out.print(" ");
			System.out.print(str);
			cnt++;
		}


	}

}