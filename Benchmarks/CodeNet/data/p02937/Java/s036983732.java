
import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        main1(sc);
    }

    private static class KP {
    	char a;
    	long index;

    	KP(char a, long index) {
    		this.a = a;
    		this.index = index;
    	}

    	public String toString() {
    		return "{c:" + a + ", i" + index + "}";
    	}
    }

    public static void main1(Scanner sc) {

    	char[] base = sc.next().toCharArray();
    	char[] target = sc.next().toCharArray();

    	boolean[] bf = new boolean[256] ;
    	boolean[] tf = new boolean[256];

    	for (char c : target) {
    		tf[c] = true;
    	}

    	LinkedList<KP> l = new LinkedList<KP>();
    	int i = 0;
    	for (char c : base) {
    		bf[c] = true;

    		if (tf[c]) {
    			l.add(new KP(c, i));
    		}
    		i++;
    	}

    	for (int k = 0; k < tf.length; k++) {
    		if (tf[k] && !bf[k]) {
    			System.out.println("-1");
    			return;
    		}
    	}

    	int cnt = 0;
    	int len = target.length - 1;
    	for (int k = 0; k < 100000; k++) {
    		for (KP ent: l) {
    			if (target[cnt] == ent.a) {
    				if (cnt < len) {
        				cnt++;
    				} else {
    					System.out.println((k) * base.length + ent.index + 1);
    					return;
    				}
    			}
    		}
    	}

    }
	public static void mainaaa(String[] args) throws Exception {
		String in2 = "contest\r\n" +
				"son";

		String in3 = "contest\r\n" +
				"programming";

		String in1 = "contest\r\n" +
				"sentence";

		Scanner sc = new Scanner(new ByteArrayInputStream(in1.getBytes()));
		main1(sc);

		sc = new Scanner(new ByteArrayInputStream(in2.getBytes()));
		main1(sc);

		sc = new Scanner(new ByteArrayInputStream(in3.getBytes()));
		main1(sc);
	}
}