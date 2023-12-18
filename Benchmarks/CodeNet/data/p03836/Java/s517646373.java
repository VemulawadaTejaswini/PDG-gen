import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int sx = stdIn.nextInt();
		int sy = stdIn.nextInt();
		
		int tx = stdIn.nextInt();
		int ty = stdIn.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=sy; i<ty ; i++) {
			sb.append('U');
		}
		for(int i=sx; i<tx ; i++) {
			sb.append('R');
		}
		for(int i=ty; i>sy ; i--) {
			sb.append('D');
		}
		for(int i=tx; i>sx ; i--) {
			sb.append('L');
		}
		sb.append('L');
		
		
		for(int i=sy; i<ty+1 ; i++) {
			sb.append('U');
		}
		for(int i=sx-1; i<tx ; i++) {
			sb.append('R');
		}
		sb.append('D');
		sb.append('R');
		for(int i=ty; i>sy-1 ; i--) {
			sb.append('D');
		}
		for(int i=tx+1; i>sx ; i--) {
			sb.append('L');
		}
		sb.append('U');
		System.out.println(sb.toString());
	}
}
