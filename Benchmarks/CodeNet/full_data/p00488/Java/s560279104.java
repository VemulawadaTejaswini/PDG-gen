import java.util.*;
import java.util.regex.Pattern;
public class Main {
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		int [] pasta = new int[3];
		int [] juice = new int[2];
		for(int i = 0; i < 3; i++){
			pasta[i] = sc.nextInt();
		}
		for(int i = 0; i < 2; i++){
			juice[i] = sc.nextInt();
		}
		int ans = 1 << 24;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 2; j++){
				int value = pasta[i] + juice[j] - 50;
				ans = Math.min(ans, value);
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}