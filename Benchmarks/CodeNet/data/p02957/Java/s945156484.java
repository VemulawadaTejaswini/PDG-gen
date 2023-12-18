import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		ArrayList<Integer> b = new ArrayList<Integer>();

		for(int i=0;i<a;i++) {
			b.add(sc.nextInt());
		}

		int k=0;

		for(int i=0;i<b.size()-1&&k==0;i++) {
			if(b.get(i)<b.get(i+1)) {
				k=1;
			}else if(b.get(i)>b.get(i+1)) {
				k=-1;
			}
		}

		if(k==1) {//上昇している
			int TF=0;
			JUDGE: for(int i=0;i<b.size()-1;i++) {
				if(b.get(i)>b.get(i+1)) {
					TF++;
					if(TF==2) {
						break JUDGE;
					}
				}
			}
			if(TF<=1) {
				System.out.print("YES");
			}else {
				System.out.print("NO");
			}
		}


		if(k==-1) {//下降している
			int TF=0;
			JUDGE: for(int i=0;i<b.size()-1;i++) {
				if(b.get(i)<b.get(i+1)) {
					TF++;
					if(TF==2) {
						break JUDGE;
					}
				}
			}
			if(TF<=1) {
				System.out.print("YES");
			}else {
				System.out.print("NO");
			}
		}

		if(k==0) {
			System.out.println("YES");
		}

	}

}
