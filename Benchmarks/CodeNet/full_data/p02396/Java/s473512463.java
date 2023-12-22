
import java.util.Scanner;

public class B3 {
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
		if(i == 10000){
			System.out.println("Too Large");
		}else{
			for(i = 1; i - 1 != j; i++){
				System.out.println("case " + i + ":" + " " + t[i-1]);
			}
		}
	}
}