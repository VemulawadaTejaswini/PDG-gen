import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// void call(int n){
//   int i = 1;
//  CHECK_NUM:
//   int x = i;
//   if ( x % 3 == 0 ){
//     cout << " " << i;
//     goto END_CHECK_NUM;
//   }
//  INCLUDE3:
//   if ( x % 10 == 3 ){
//     cout << " " << i;
//     goto END_CHECK_NUM;
//   }
//   x /= 10;
//   if ( x ) goto INCLUDE3;
//  END_CHECK_NUM:
//   if ( ++i <= n ) goto CHECK_NUM;
//
//   cout << endl;
// }

public class Main{

    private static void recursiveFoolJob(Integer i, Integer n, Integer x) {
	x = i;
	if ( x % 3 == 0 ) {
	    System.out.print(" " + i);
	    deadEnd(i,n,x);
	} else {
	    recursiveBadJob(i,n,x);
	}
    }

    private static void recursiveBadJob(Integer i, Integer n, Integer x) {
	if ( x % 10 == 3 ) {
	    System.out.print(" " + i);
	    deadEnd(i,n,x);
	} else {
	    x = x / 10;
	    if (x==1) {
		recursiveBadJob(i,n,x);
	    } else {
		deadEnd(i,n,x);
	    }
	}
    }

    private static void deadEnd(Integer i, Integer n, Integer x) {
	if (i++ <= n) {
	    recursiveFoolJob(i, n, x);
	} else {
	    System.out.println("");
	    System.exit(0);
	}
    }

    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();

	    for (String line = br.readLine(); line != null; line = br.readLine()) {
		lines.add(line);
	    }
	    br.close();

	    Integer n = Integer.parseInt(lines.get(0));
	    Integer i = 1;

	    recursiveFoolJob(i, n, i);

	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}