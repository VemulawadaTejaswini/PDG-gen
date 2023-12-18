import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		Scanner vd= new Scanner(System.in);
		int n = vd. nextInt();
		int[] l = new int[n];
		for(int i=0; i<n;i++) l[i] = vd.nextInt();
		vd.close();

		int max=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;++i) {
			if(max<l[i]) max=l[i];
		}
		for(int i=0;i<n;++i) {
			if(min>l[i]) min=l[i];
		}
		System.out.println(max-min);
	}

}
