import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	try {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    List<String> lines = new ArrayList<String>();
	    String line = "";

	    while((line = br.readLine()) != null){
	     	lines.add(line);
	    }
	    br.close();

	    //lines.add("3 2 3");

	    //lines.add("1 2");
	    //lines.add("0 3");
	    //lines.add("4 5");

	    //lines.add("1 2 1");
	    //lines.add("0 3 2");

	    Integer n, m, l = 0;
	    n = Integer.parseInt(lines.get(0).split(" ")[0]);
	    m = Integer.parseInt(lines.get(0).split(" ")[1]);
	    l = Integer.parseInt(lines.get(0).split(" ")[2]);

	    Integer[][] A = new Integer[n][m];
	    Integer[][] b = new Integer[m][l];
	    Integer[][] C = new Integer[n][l];

	    for (int i=1; i<n+1; i++) {
		String[] elements = lines.get(i).split(" ");
		for (int j=0; j<m; j++) {
		    A[i-1][j] = Integer.parseInt(elements[j]);
		}
	    }
	    for (int i=n+1; i<n+m+1; i++) {
		String[] elements = lines.get(i).split(" ");
		for (int j=0; j<l; j++) {
		    b[i-n-1][j] = Integer.parseInt(elements[j]);
		}
	    }

	    //          [l]
	    //      __________
	    //      |  |  |  |
	    //	    |  |  |  |
	    // [n]  |  |  |  |
	    //      |--|--|--|
	    //
	    for (int i=0; i<n; i++) {
		for (int j=0; j<l; j++) {
		    C[i][j] = 0;
		}
	    }

	    for (int i=0; i<n; i++) {
		for (int j=0; j<m; j++) {
		    for (int k=0; k<l; k++) {
			//System.out.print(String.format("%d * %d ,", A[i][j], b[j][k]));
			Integer x = A[i][j] * b[j][k];
			C[i][k] += x;
		    }
		}
	    }

	    for (int i=0; i<n; i++) {
		for (int j=0; j<l; j++) {
		    if (j == l-1) {
			System.out.println(C[i][j]);
		    } else {
			System.out.print(C[i][j] + " ");
		    }
		}
	    }

	    System.exit(0);

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    System.out.println(Arrays.toString(e.getStackTrace()));
	    System.exit(0);
	}
    }
}