import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    long[] t=new long[n];
    for(int i=0;i<n;i++)t[i]=sc.nextLong();
    long res=LCM(t[0],t[1]);
    for(int i=2;i<n;i++)res=LCM(res,t[i]);
    System.out.println(res);
  }
	/*min,maxの最大公約数を求める。引数の大小は気を付ける*/
	public static long GCD(long min,long max) {
		if(max%min==0)return min;
		else return GCD(max%min,min);
	}
	/*min,maxの最小公倍数を求める。GCDとセットで使うように。引数の大小は気を付ける*/
	public static long LCM(long min,long max) {
		return (min*max)/GCD(min,max);
	}
}
