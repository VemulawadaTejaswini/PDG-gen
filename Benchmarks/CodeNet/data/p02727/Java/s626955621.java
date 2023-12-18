import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{

        // Mapの宣言
        Map<Integer, String> mMap = new HashMap<Integer, String>();

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int na = sc.nextInt();
		int nb = sc.nextInt();
		int nc = sc.nextInt();

		Integer a;
		for (int i=0; i<na; i++) {
			a=new Integer(sc.nextInt());
	        mMap.put( a, "a");
		}
		for (int i=0; i<nb; i++) {
			a=new Integer(sc.nextInt());
	        mMap.put( a, "b");
		}
		for (int i=0; i<nc; i++) {
			a=new Integer(sc.nextInt());
	        mMap.put( a, "c");
		}
		sc.close();

        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey, Collections.reverseOrder());

        BigInteger ans = BigInteger.ZERO;
        int aa = 0;
        int bb = 0;
        int max = x+y;
        int size = 0;
        for (int i = 0; i<mapkey.length; i++)
        {
        	Object nKey = mapkey[i];
        	if (mMap.get(nKey) == "a") {
        		aa++;
        		if (aa <= x) {
        			ans = ans.add(BigInteger.valueOf((Integer)nKey));
        			size ++;
        		}
        	} else if (mMap.get(nKey) == "b") {
            	bb++;
            	if (bb <= y) {
        			ans = ans.add(BigInteger.valueOf((Integer)nKey));
            		size ++;
            	}
            } else {
    			ans = ans.add(BigInteger.valueOf((Integer)nKey));
            	size++;
            }
        	if (size ==max) break;
       	}
		System.out.println(ans.toString());
	}
}
