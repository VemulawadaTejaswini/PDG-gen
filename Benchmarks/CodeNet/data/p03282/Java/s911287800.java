import java.util.Scanner;

public class Muin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		long k=sc.nextLong();
		long[] ranran=new long[100];
		char[] ctr=str.toCharArray();
		
		int j=0;
		while(ctr[j]=='1') {
//			System.out.println(j);
			j++;
		}
		
		if(j>=k)System.out.println(1);
		else System.out.println(String.valueOf(ctr[j]));
		
//		for(int j=0; j<ctr.length; j++) {
//			String ss=String.valueOf(ctr[j]);
//			ranran[j]=pow(Integer.parseInt(ss),5000000000000000L);
//			//ranran[j]=Integer.parseInt(ss)*5000000000000000L;
//		}
//		long sp=0;
//		int num;
//		for(num=0;sp<=k;num++) {
//			sp+=ranran[num];
//		}
//		num--;
////		System.out.println(num);
//		System.out.println(String.valueOf(ctr[num]));
//	}
//	public static int pow(int j,long l) {
//		if(j==1)return 1;
//		int ret=1;
//		for(int u=0;u<l;u++) {
//			ret*=j;
//			if(ret<0)return Integer.MAX_VALUE;
//		}
//		return ret;
//	}
	}
}
