import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1≤N≤200000
		//1≤ai≤N
		int n = sc.nextInt();
		List<Integer> a = new LinkedList<>();
		for(int i=0;i<n;i++) {
			a.add(sc.nextInt());
		}
		sc.close();
		int idx=0;
		int ii=1;
		int cnt=0;
		int ds = a.size();
		do {
			if(a.get(idx)==ii) {
				ii++;
				idx++;
			}else {
				a.remove(idx);
				cnt++;
			}
		}while(a.size()>idx);
		System.out.println(ds==cnt?-1:cnt);
	}
}
