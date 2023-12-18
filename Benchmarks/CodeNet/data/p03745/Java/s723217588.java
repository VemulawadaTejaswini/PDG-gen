import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] a = new int[n]; 
		for (i = 0; i < a.length; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int top=0;
		int bottom=0;
		boolean up=false;
		boolean down=false;
		for (i = 1; i < a.length; i++) {
			if(a[i-1]<a[i]) {
				if(down) {
					bottom++;
					up=false;
				} else {
					up=true;
				}
				down=false;
			} else if(a[i-1]>a[i]) {
				if(up) {
					top++;
					down=false;
				} else {
					down=true;
				}
				up=false;
			}
		}
		out.println(top+bottom+1);
	}
}
