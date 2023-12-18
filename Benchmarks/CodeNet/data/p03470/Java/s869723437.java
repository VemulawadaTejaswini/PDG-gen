import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int counter = 1;
		Scanner vd = new Scanner(System.in);
		int n = vd.nextInt();
		int[] cd = new int[n];
		for(int i=0; i<n; ++i) cd[i]=vd.nextInt();
		vd.close();
		for(int i=0; i<n-1; ++i) {
			if(cd[i]>cd[i+1]) counter++;
			else counter=1;
		}
		System.out.println(counter);

	}

}
