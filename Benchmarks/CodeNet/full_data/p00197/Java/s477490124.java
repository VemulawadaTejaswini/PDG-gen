import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(s.hasNext()) {
	    int a, b;
	    a = s.nextInt();
	    b = s.nextInt();
	    if(a == 0 && b == 0) break;
	    int cnt = 0;
	    for(; b != 0; ++cnt) {
		int na, nb;
		na = a; nb = b;
		a = nb;
		b = na%nb;
	    }
	    System.out.println(a+" "+cnt);
	}
    }
}