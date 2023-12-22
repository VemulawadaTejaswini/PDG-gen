/*
 * Aizu Online Judge 2015
 *   Square Route
 *
 * author : Yohei Ito
 * date : 2010/06/04
 * time : 20:27
 * memo :
 *   Å, ðàPDFÅ¾íêÄ¢éÆ±ëÌWOUOÌð@ÅâÁÄÝ½ª,
 *   å«¢ÉÏ¦çê¸, ^C~bgÅøÁ©©Á½.
 *   ðàPDFÅÅàI[_[ª¬³¢àÌðIñÅ,
 *   JjOµÈªçð­`ÆÈÁ½.
 */
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt(), m = sc.nextInt();
			if(n == 0 && m == 0) break;

			int[] x = new int[n+1], y = new int[m+1];
			x[0] = y[0] = 0;

			for(int i=0;i<n;i++){
				int h = sc.nextInt();
				x[i+1] = x[i] + h;
			}
			for(int i=0;i<m;i++){
				int w = sc.nextInt();
				y[i+1] = y[i] + w;
			}

			HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

			for(int i=0;i<n+1;i++){
				for(int j=0;j<m+1;j++){
					Integer value = map.get(y[j] - x[i]);
					map.put(y[j]-x[i], value==null ? 1 : value+1);
				}
			}

			int count = 0;
			for(Integer key : map.keySet()){
				int value = map.get(key);
				count += value * (value - 1) / 2;
			}
			System.out.println(count);
		}
	}
}