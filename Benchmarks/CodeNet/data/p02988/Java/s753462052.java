import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[n];
      	int a = 0;
		//pをn回出力
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
		}
		//真ん中のpが2番目に小さい数であれば、aを１ずつ増やす
		for(int i=1; i<n-1; i++) {
			if((p[i-1]<p[i])&&(p[i]<p[i+1])) {
				a++;
			}else if((p[i-1]>p[i]&&(p[i]>p[i+1]))){
				a++;
			}
		}
		System.out.println(a);
	}
}