
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x, i = 0, j, t[];
		t = new int[10000];
		while(i < 10000){
			Scanner sc = new Scanner(System.in);
			x = sc.nextInt();
			if(x == 0)
				break;
			t[i] = x;
			i++;
		}
		j = i;
		for(i = 1; i != j - 1; i++){
			System.out.println("case " + i + ":" + " " + t[i-1]);
		}
	}
}