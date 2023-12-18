import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			A.add(sc.nextInt());
		}
		A.sort(Collections.reverseOrder());
		int ret = 0;
		while(!A.isEmpty()) {
			int Aj = findaj(A.get(0));
			//System.out.println(Aj);
			int indAj = Collections.binarySearch(A, Aj,Collections.reverseOrder());
			//System.out.println(indAj);
			if (indAj > 0) {//0だとAiになってしまう
				ret++;
				A.remove(indAj); //０はあとで削除　ずれる
				A.remove(0);
			}
			else A.remove(0);
		}
		System.out.println(ret);
	}
	
	//Ai+Aj=2^kとなるAjを返す
	public static int findaj(int a) {
		return findmink(a)-a;
	}
	
	// aよりも大きい最小の2^kを返す
	public static int findmink(int a) {
		int k = 0;
		int mul = 1;
		while(mul <= a) {
			k++;
			mul *= 2;
		}
		return mul;
	}
}