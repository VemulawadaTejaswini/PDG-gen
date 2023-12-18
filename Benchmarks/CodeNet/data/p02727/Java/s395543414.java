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
		for(int i=0; i<c; i++){
			Arrays.sort(aresult);
			Arrays.sort(bresult);
			boolean flag = false;
			if(aresult[0] > bresult[0]) {
				flag = true;
			}
			int min = Math.min(aresult[0], bresult[0]);
			if(cary[c-1] > min){
				if(flag){
					bresult[0] = cary[c-1];
				} else {
					aresult[0] = cary[c-1];
				}
			} else {
				break;
			}
		}
		int result = 0;
		for(int i=0; i<x; i++){
			result += aresult[i];
		}
		for(int i=0; i<y; i++){
			result += bresult[i];
		}
		System.out.println(result);
	}
}
