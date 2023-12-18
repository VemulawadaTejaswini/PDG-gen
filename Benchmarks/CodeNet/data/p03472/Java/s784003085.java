import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long H = sc.nextLong();
		Main main = new Main();
		Knife[] knife = new Knife[2*N];
		for (int i=0;i<N;i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			Knife ak = main.new Knife();
			ak.damage = a;
			ak.count = 100;
			Knife bk = main.new Knife();
			bk.damage = b;
			bk.count = 1;
			knife[i*2] = ak;
			knife[i*2+1] = bk;
		}
		Arrays.sort(knife);
		int count =0;
		for (int i=2*N-1;i>=0;i--) {
			if (knife[i].count==1) {
				count++;
				H-=knife[i].damage;
				if (H<=0) {
					break;
				}
			} else {
				count +=H/knife[i].damage;
				if (H%knife[i].damage!=0) {
					count++;
				}
				break;
			}
		}
		System.out.println(count);
	}

	public class Knife implements Comparable{
		long damage;
		int count;
		@Override
		public int compareTo(Object o) {
			Knife temp = (Knife)o;
			if(this.damage-temp.damage>0) {
				return 1;
			}
			return -1;
		}


	}
}