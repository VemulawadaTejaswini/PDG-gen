import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str=bfr.readLine();
		String[] mj=str.split(" ");
		int a=Integer.parseInt(mj[0]);
		int b=Integer.parseInt(mj[1]);
		boolean ts1=false;
		boolean ts2=false;
		for(int i=0; i<499500; i++) {
			ts1=isTsumori(a+i);
			ts2=isTsumori(b+i);
			if(ts1==true && ts2==true) {
				System.out.println(i);
				System.exit(0);
			}
			else {
				ts1=false; ts2=false;
			}
		}
	}

	public static boolean isTsumori(int a) {
		for(int i=1; i<=100; i++) {
			if(a==i*(i+1)/2) {
				return true;
			}
		}
		return false;
	}
}