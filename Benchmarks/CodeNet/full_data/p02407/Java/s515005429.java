import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		Integer list[] = new Integer[line];
		for(int i = 0; i < line; i++){
			list[i] = sc.nextInt();
		}
		Arrays.sort(list, Collections.reverseOrder());
		for(int i = 0; i < list.length; i++){
			if(i == 0){
				System.out.print(list[i]);
			}else{
				System.out.print(" " + list[i]);
			}
		}
		sc.close();
	}

}
