import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		ArrayList<Integer> rindex = new ArrayList<>(), gindex = new ArrayList<>(), bindex = new ArrayList<>() ;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)=='R') {
				rindex.add(i);
			}else if(S.charAt(i)=='G') {
				gindex.add(i);
			}else {
				bindex.add(i);
			}
		}
		long cnt =0;
		for(int i=0;i<rindex.size();i++) {
			for(int j=0;j<gindex.size();j++) {
				for(int k=0;k<bindex.size();k++) {
					if(Math.abs(rindex.get(i)-gindex.get(j))!=Math.abs(rindex.get(i)-bindex.get(k))
							&& Math.abs(rindex.get(i)-gindex.get(j))!=Math.abs(gindex.get(j)-bindex.get(k))
							&& Math.abs(rindex.get(i)-bindex.get(k))!=Math.abs(gindex.get(j)-bindex.get(k))) {
						cnt+=1;
					}
//					int[] indexes = {rindex.get(i),gindex.get(j),bindex.get(k)};
//					Arrays.sort(indexes);
//					if(indexes[1]-indexes[0] !=indexes[2]-indexes[1]) {
//						cnt+=1;
//					}
				}
			}
		}
		System.out.println(cnt);
	}

}