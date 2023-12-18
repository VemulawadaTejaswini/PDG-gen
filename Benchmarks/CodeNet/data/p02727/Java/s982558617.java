import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] aary = new int[a];
		int[] bary = new int[b];
		int[] cary = new int[c];
		for(int i=0; i<a; i++){
			aary[i] = sc.nextInt();
		}
		for(int i=0; i<b; i++){
			bary[i] = sc.nextInt();
		}
		for(int i=0; i<c; i++){
			cary[i] = sc.nextInt();
		}
		Arrays.sort(aary);
		Arrays.sort(bary);
		Arrays.sort(cary);
		int[] aresult = new int[x];
		int[] bresult = new int[y];
		for(int i=0; i<x; i++){
			aresult[i] = aary[a-i-1];
		}
		for(int i=0; i<y; i++){
			bresult[i] = bary[b-i-1];
		}
		int acount = x;
		int bcount = y;
		int ccount = c;
		for(int i=0; i<c; i++){
			if(aresult[acount-1] > bresult[bcount-1]){
				if (bresult[bcount-1] < cary[ccount-1]) {
					ccount--;
					bcount--;
				} else {
					break;
				}
			} else {
				if (aresult[acount-1] < cary[ccount-1]) {
					ccount--;
					acount--;
				} else {
				break;
				}
			}
		}
		int result = 0;
		for(int i=0; i<acount; i++){
			result += aresult[i];
		}
		for(int i=0; i<bcount; i++){
			result += bresult[i];
		}
		for(int i=ccount; i<c; i++){
			result += cary[i];
		}
		System.out.println(result);
	}
}
