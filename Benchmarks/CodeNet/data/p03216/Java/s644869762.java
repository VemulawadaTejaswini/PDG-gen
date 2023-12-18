import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

	int[] m = new int[q];
	
	for (int ia : a) {
	    Iterator<Integer> itb = b.iterator();
	    while (itb.hasNext()) {
		int ib = itb.next();
		if (ib < ia) {
		    itb.remove();
		    continue;
		}
		Iterator<Integer> itc = c.iterator();
		while (itc.hasNext()) {
		    int ic = itc.next();
		    if (ic < ia) {
			itc.remove();
			continue;
		    } else if (ic < ib) {
			continue;
		    }
		    for (int i=0;i<q;i++) {
			if (ic-ia < k[i]) m[i]++;
		    }
		}
	    }
	}
	
	for (int i=0;i<q;i++) System.out.println(m[i]);
	
    }

}