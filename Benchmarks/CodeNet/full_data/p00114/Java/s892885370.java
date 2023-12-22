import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			long a1=cin.nextInt();
			long m1=cin.nextInt();
			long a2=cin.nextInt();
			long m2=cin.nextInt();
			long a3=cin.nextInt();
			long m3=cin.nextInt();
			if((a1|a2|a3|m1|m2|m3)==0){
				break;
			}
			long cnt1=cnt(a1,m1);
			long cnt2=cnt(a2,m2);
			long cnt3=cnt(a3,m3);
			long a = (cnt1*cnt2)/l(cnt1,cnt2);
			long b = (cnt3*a)/l(cnt3,a);
			System.out.println(b);
		}
		
	}
	static long l(long a,long b){
		if(a<b){
			long tmp=a;
			a=b;
			b=tmp;
		}
		if(b==0)return a;
		return l(b,a%b);
	}
	static long cnt(long a,long b){
		long x=1,cnt=0;
		
		do{
			x=(x*a)%b;
			cnt++;
		}while(x!=1);
		return cnt;
	}
}