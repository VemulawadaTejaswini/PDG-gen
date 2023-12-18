import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {

		int first[] = new int[2];

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String str = null;

		 try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		 String[] spl = str.split(" ");

		 for(int i = 0;i<2;i++) {
			 first[i] = Integer.parseInt(spl[i]);
		 }

		 int second[] = new int[first[0]];
		 int sum = 0;
		 int temp;

		InputStreamReader isr2 = new InputStreamReader(System.in);
		BufferedReader br2 = new BufferedReader(isr2);

		String str2 = null;

		 try {
			str2 = br2.readLine();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		 String[] spl2 = str2.split(" ");

		 for(int j = 0;j<first[0];j++) {
			 second[j] = Integer.parseInt(spl2[j]);
			 sum += second[j];
		 }

		 for(int k=0;k<second.length;k++) {
			 for(int l=second.length-1;l>k;l--) {
				 if(second[l-1]<second[l]) {
					 temp = second[l-1];
					 second[l-1] = second[l];
					 second[l] = temp;
				 }
			 }
		 }

		 if(second[first[1]]>=(sum/4/first[0])) {
			 System.out.print("Yes");
		 }
		 else {
			 System.out.print("No");
		 }
	}
}
