import java.util.*;
import static java.lang.System.*;
import java.io.*;
public class Main  {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder a = new StringBuilder(sc.next());
		StringBuilder b = new StringBuilder(sc.next());
		StringBuilder c = new StringBuilder(sc.next());
		char turn = 'A';
		while(true) {
			StringBuilder sb = new StringBuilder();
			if( turn == 'A')  sb = a;
			if (turn == 'B') sb = b;
			if(turn == 'C') sb = c;
			if (sb.length() == 0) break;
			char ch = sb.charAt(0);
			ch -= 32;
			turn = ch;
			sb.deleteCharAt(0);
		}
		out.println(turn);
	}
}

