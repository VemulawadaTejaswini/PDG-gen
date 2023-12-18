import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  N;
		N = sc.nextInt();
		long K;
		K = sc.nextLong();
		String Kb=Long.toBinaryString(K);
		int[] data=new int[41];
		StringBuffer kbx= new StringBuffer(Kb);
		Kb=kbx.reverse().toString();
		int keta=Kb.length();
		for(int i=0;i<N;i++) {
		long X = sc.nextLong();
		String Xb=Long.toBinaryString(X);
		StringBuffer xx= new StringBuffer(Xb);
		String xbRe=xx.reverse().toString();
		for(int j=0;j<xbRe.length();j++) {
			data[j]=data[j]+xbRe.charAt(j)-'0';
		}
		}
		for(int i=0;i<keta;i++) {
			if(data[i]<N-data[i])data[i]=N-data[i];
		}
		double ans=0;
		for(int i=0;i<41;i++) {
			ans=ans+Math.pow(2,i)*data[i];
		}
		long answer=(long)ans;
		System.out.println(answer);
			
	}
}
