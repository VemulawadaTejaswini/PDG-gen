import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		if(n%2==0) {
			String flag = "t";
			for(int i=0;i<n/2;i++) {
				if(a[i*2]!=a[i*2+1]){
					flag = "f";
				}
			}
			if(flag.equals("f")) {
				System.out.println(0);
			}else {
				System.out.println(Math.pow(2, n/2)%(1000000007));
			}
		}else {
			if(a[0]==0) {
				String flag = "t";
				for(int i=0;i<n/2;i++) {
					if(a[i*2+1]!=a[i*2+2]){
						flag = "f";
					}
				}
				System.out.println(flag);
				if(flag.equals("f")) {
					System.out.println(0);
				}else {
					System.out.println(Math.pow(2, n/2)%(1000000007));
				}
			}else {
				System.out.println(0);
			}
		}
	}

}