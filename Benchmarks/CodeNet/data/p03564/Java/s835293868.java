import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int k = sc.nextInt(); 
		int denkou = 1;
		for(int i = 0; i < n; i++) {
			if(denkou+k > denkou*2) {
				denkou *= 2;
			} else {
				denkou += k;
			}
		}
		System.out.println(denkou);
	}
}