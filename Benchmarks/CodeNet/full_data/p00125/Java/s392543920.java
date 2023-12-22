import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	while(true) {
	    int d[][] = new int[2][3];
	    boolean flag = false;
	    for(int i = 0; i < 2; ++i) {
		for(int j = 0; j < 3; ++j) {
		    d[i][j] = s.nextInt();
		    if(d[i][j] != -1) flag = true;
		}
	    }
	    if(!flag) break;
	    Calendar a, b;
	    a = Calendar.getInstance();
	    b = Calendar.getInstance();
	    a.set(d[0][0],d[0][1],d[0][2]);
	    b.set(d[1][0],d[1][1],d[1][2]);
	    System.out.println((b.getTimeInMillis()-a.getTimeInMillis())/(1000L*60L*60L*24L));
	}
    }
}