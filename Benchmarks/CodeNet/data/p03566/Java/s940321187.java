import java.util.Arrays;
import java.util.Scanner;

public class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());}

	public static void main(String[] $){
		int n=gInt(),t[]=new int[n],v[]=new int[n+1];

		double r=0;

		for(int i=0;i<n;++i) {
			t[i]=gInt()*2;
		}
		Arrays.parallelPrefix(t,Integer::sum);
		for(int i=0;i<n;++i) {
			v[i]=gInt();
		}

		int curz=0;
		double speed=0;
		for(int ct=1;curz<n;++ct) {
			double nextspeed=speed;
			if((speed-v[curz+1])*2>=t[curz]-ct+1) {
				nextspeed-=0.5;
			//	System.out.println("-");
			}else if(speed<v[curz]) {
				nextspeed+=0.5;
			//	System.out.println("+");
			}
			r+=(speed+nextspeed)*0.5*0.5;
			speed=nextspeed;
			if(ct>=t[curz])
				++curz;
		}
		System.out.println(r);
	}
}