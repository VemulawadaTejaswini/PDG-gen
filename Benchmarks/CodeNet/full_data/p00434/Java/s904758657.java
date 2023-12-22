import java.util.*;
public class dareda {
	Scanner sc = new Scanner(System.in);
	int[] a = new int[30];
	int i,n = 0;

	public void hantei() {
		Arrays.fill(a,0);
		for(i = 0;i <= 29;i++) {
			n = sc.nextInt();
			a[n-1] = 1;
	}
	for(i = 0;i <= 29;i++) {
		if(a[i] != 1) {
			System.out.println(i +1);
		}
	}
	}
	public static void main(String[] args) {
		dareda ou = new dareda();
		ou.hantei();
	}
		// TODO 自動生成されたメソッド・スタブ
}