import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int taro_n = 0;
		int hanako_n = 0;

		for(int i = 0; i < n; i++){
			String taro = scanner.next();
			String hanako = scanner.next();

			if(taro.compareTo(hanako) > 0){
				taro_n += 3;
			}else if(taro.compareTo(hanako) < 0){
				hanako_n += 3;
			}else{
				taro_n ++;
				hanako_n ++;
			}

		}

			System.out.println(taro_n + " " + hanako_n);
		}
}