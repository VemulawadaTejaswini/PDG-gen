import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}

		int kazu = 0;
		int answer =0;

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]==a[j]) {
					kazu++;
				}
			}
			if(a[i]!=kazu) {
				a[i]=-1;
				answer++;
			}
			kazu =0;
		}
		System.out.print(answer);
	}

}
