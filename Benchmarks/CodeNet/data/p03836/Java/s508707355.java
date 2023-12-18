import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sx = Integer.parseInt(sc.next());
		int sy = Integer.parseInt(sc.next());
		int tx = Integer.parseInt(sc.next());
		int ty = Integer.parseInt(sc.next());
		StringBuilder sb = new StringBuilder();
		for(int i=sy; i<ty; i++) {
		    sb.append("U");
		}
		for(int i=sx; i<tx+1; i++) {
		    sb.append("R");
		}
		for(int i=ty; i>sy-1; i--) {
		    sb.append("D");
		}
		for(int i=tx+1; i>sx; i--) {
		    sb.append("L");
		}
		sb.append("U");
		sb.append("L");
		for(int i=sy; i<ty+1; i++) {
		    sb.append("U");
		}
		for(int i=sx-1; i<tx; i++) {
		    sb.append("R");
		}
		for(int i=ty+1; i>sy; i--) {
		    sb.append("D");
		}
		for(int i=tx; i>sx; i--) {
		    sb.append("L");
		}
		System.out.println(String.valueOf(sb));
	}
	
}