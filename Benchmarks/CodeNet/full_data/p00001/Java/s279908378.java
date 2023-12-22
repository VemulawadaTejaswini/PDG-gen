
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] yama;
		int work;

		Scanner sc = new Scanner(System.in);

		yama = new int[10];
		for(int i = 0 ;i < 10 ;i++){
			yama[i] = sc.nextInt();
		}
		for(int i = 0 ;i < yama.length ;i++){
			for(int j = i+1 ; j <yama.length ;j++){
				if(yama[i] < yama[j]){
					work = yama[i];
					yama[i] = yama[j];
					yama[j] = work;
				}
			}
		}
		for(int i = 0 ;i < 3 ;i++){
			System.out.println(yama[i]);
		}
	}

}