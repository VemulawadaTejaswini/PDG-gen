import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); 
		
		int x = stdIn.nextInt();
		
		int[] l = new int[n];
		
		for(int i = 0; i < n; i++) {
			l[i] = stdIn.nextInt();
		}
		
		
		int cnt = 1;
		int length = 0;
		
		for(int i = 0; i < n; i++) {
			if(l[i] + length <= x) {
				cnt++;
				length += l[i];
			}else {
				break;
			}
		}
		System.out.println(cnt);
		
	}

}
