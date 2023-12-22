import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int character_num = sc.nextInt();
		String[] character = new String[character_num];
			for(int i = 0; i != character_num; i++){
				character[i] = sc.next();
			}
		Arrays.sort(character);
		System.out.println(character[0]);
	}
}