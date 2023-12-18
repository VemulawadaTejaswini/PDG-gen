import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int a = -1000; a <= 10000; a++){
			for(int b = -10000; b < 10000; b++){
				if(a*a*a*a*a - b*b*b*b*b == x){
					System.out.println(a + " " + b);
					return;
				}
			}
		}
    }
}