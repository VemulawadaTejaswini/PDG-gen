import java.util.*;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
//import static java.lang.Math.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		char[] n = sc.next().toCharArray();
		sc.close();
		out.println((n[1]==n[2])&&(n[0]==n[1]||n[2]==n[3])?"Yes":"No");
	}
}
