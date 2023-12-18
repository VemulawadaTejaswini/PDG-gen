import java.util.HashMap;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> unko=new HashMap<Integer,Integer>();

		int N=sc.nextInt();

		for(int i=0; i<N; i++) {
			int tmp=sc.nextInt();
			if(unko.containsKey(tmp)) {
				unko.replace(tmp, unko.get(tmp) + 1);
				//System.out.println(unko.get(tmp));
			}
			else {
				unko.put(tmp, 1);
			}
		}
		long kosu=0;
		for(Integer key:unko.keySet()) {
			int a=key;
			int b=unko.get(a);
			if(b>a) {
				kosu+=(b-a);
			}
			else if(b<a) {
				kosu+=b;
			}
			if(a==b) {
				//
			}
			//System.out.println();
		}
		System.out.println(kosu);
	}
}