import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, taro_counter = 0, hanako_counter = 0;
		String taro, hanako;
		try (Scanner sc = new Scanner(System.in)) {
			n = sc.nextInt();
			for(int i = 0; i < n; i++) {
				taro = sc.next();
				hanako = sc.next();
				if(taro.compareTo(hanako) > 0) {
					taro_counter = taro_counter + 3;
				}else if(taro.compareTo(hanako) == 0){
					taro_counter++;
					hanako_counter++;
				}
				else {
					hanako_counter = hanako_counter + 3;
				}
			}
			System.out.println(taro_counter + " " + hanako_counter);
		}
	}
}

