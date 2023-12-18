import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int hako[] = new int[k];
		int ans=0;
		for(int i=0;i<k;i++) {
			hako[i] = sc.nextInt();
		}

		s: for(ans=n;ans<10000;ans++) {
			int h=0;//
			for(int l=0;l<k;l++) {
				int j = ans;
				//1000
				if(j/1000==hako[l]) {
					h=1;
				}
				j-=(j/1000)*1000;
				//100
				if(j/100==hako[l]) {
					h=1;
				}
				j-=(j/100)*100;
				//10
				if(j/10==hako[l]) {
					h=1;
				}
				j-=(j/10)*10;
				//1
				if(j==hako[l]) {
					h=1;
				}
			}
			/*判定*/
			if(h==0) {
				break s;
			}
		}

		System.out.println(ans);
	}
}
