import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int N = 3;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int a = parseInt(sc.next());
		int b = parseInt(sc.next());
		sc.close();
		if(a==1) a=14;
		if(b==1) b=14;
		out.println(a>b?"Alice":a<b?"Bob":"Draw");
	}
}
