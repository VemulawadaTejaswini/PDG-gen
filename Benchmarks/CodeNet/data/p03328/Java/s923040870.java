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
		for(int i=1; i<=b-a; i++) {
			ts1=false; ts2=false;
			ts1=isTsumori(a+i);
			ts2=isTsumori(b+i);
			if(ts1==true && ts2==true) {
				System.out.println(i);
				System.exit(0);
			}
		}
	}

	public static boolean isTsumori(int a) {
		for(int i=1; i<=999; i++) {
			if(a==i*(i+1)/2) {
				return true;
			}
			else if(a<i*(i+1)/2) {
				return false;
			}
		}
		return false;
	}


}