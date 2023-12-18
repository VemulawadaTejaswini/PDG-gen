import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private int n;
    private String s;
    private int q;
    private int[] k;
    private int len;
    private List<Integer> a;
    private List<Integer> b;
    private List<Integer> c;
    
    public static void main(String[] args) {
	Main m = new Main();
	m.conduct();
    }

    private void conduct() {
	try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
	    n = Integer.parseInt(br.readLine());
	    s = br.readLine();
	    q = Integer.parseInt(br.readLine());
	    k = Arrays.stream(br.readLine().split("[\\s]+")).mapToInt(Integer::parseInt).toArray();
	    a = new ArrayList<>();
	    b = new ArrayList<>();
	    c = new ArrayList<>();
	} catch(IOException e) {
	    e.printStackTrace();
	}
	
	for (int i=0;i<n;i++) {
	    switch (s.charAt(i)) {
	    case 'D':
		a.add(i);
		break;
	    case 'M':
		b.add(i);
		break;
	    case 'C':
		c.add(i);
		break;
	    }
	}

	for (int i=0;i<q;i++) {
	    int m = 0;
	    for (int ia : a) {
		for (int ib : b) {
		    if (ib < ia) continue;
		    for (int ic : c) {
			if (ic < ib) continue;
			if (ic-ia < k[i]) m++;
		    }
		}
	    }
	    System.out.println(m);
	}
	
    }

}