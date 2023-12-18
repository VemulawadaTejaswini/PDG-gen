import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		City[] arr = new City[M];
		int p = 0;
		int y = 0;
		for(int i=0;i<M;i++) {
			token = new StringTokenizer(br.readLine());
			p = Integer.parseInt(token.nextToken());
			y = Integer.parseInt(token.nextToken());
			arr[i] = new City(p, y, i);
		}
		
		Arrays.sort(arr, (Comparator<City>) (City c1, City c2) -> c1.p == c2.p ? c1.y.compareTo(c2.y) : c1.p.compareTo(c2.p));//(Comparator<? super Integer[]>)(Integer[] a1, Integer[] a2) -> a1[0].compareTo(a2[0])

		int po = 0;
		for(int i=0;i<M;i++) {
			if(i == 0 || arr[i].p != arr[i-1].p) {
				po = 1;
			}
			arr[i].po = po;
			po++;
		}
		
		Arrays.sort(arr, (Comparator<City>) (City c1, City c2) -> c1.so.compareTo(c2.so));
		
		for(int i=0;i<M;i++) {
			System.out.println(leftPad(arr[i].p) + leftPad(arr[i].po));
		}
	}
	
	private static class City{
		Integer p;
		Integer y;
		Integer so;
		Integer po;
		City(Integer a, Integer b, Integer c){
			p = a;
			y = b;
			so = c;
		}
	}
	
	private static String leftPad(int num) {
		if(num > 99999) return ""+num;
		else if(num > 9999) return "0"+num;
		else if(num > 999) return "00"+num;
		else if(num > 99) return "000"+num;
		else if(num > 9) return "0000"+num;
		else if(num > 0) return "00000"+num;
		return "";
	}
}