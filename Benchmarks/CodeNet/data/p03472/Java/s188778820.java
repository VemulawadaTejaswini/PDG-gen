import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long H = sc.nextLong();
		Main main = new Main();
		List<Knife> list = new ArrayList<Knife>();
		for (int i=0;i<N;i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			Knife ak = main.new Knife();
			ak.damage = a;
			ak.count = 100;
			Knife bk = main.new Knife();
			bk.damage = b;
			bk.count = 1;
			list.add(ak);
			list.add(bk);
		}
		Collections.sort(list);
		long count =0;
		for (int i=2*N-1;i>=0;i--) {
			Knife knife = list.get(i);
			if (knife.count==1) {
				count++;
				H-=knife.damage;
				if (H<=0) {
					break;
				}
			} else {
				while (H<0) {
					count++;
					H-=knife.damage;
				}
//				count +=H/knife.damage;
//				if (H%knife.damage!=0) {
//					count++;
//				}
				break;
			}
		}
		System.out.println(count);
	}

	public class Knife implements Comparable<Knife>{
		long damage;
		int count;
		@Override
		public int compareTo(Knife o) {
			if(this.damage-o.damage>0) {
				return 1;
			}
			return -1;
		}


	}
}