//package bigneer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//		int t=Integer.parseInt(br.readLine());
//		while(t-->0) {
//			int n=Integer.parseInt(br.readLine());
			String q[]=br.readLine().split(" ");
			long a=Long.parseLong(q[0]);
			double b=Double.parseDouble(q[1]);
//			long ans=;
			System.out.println(Math.round((a*b)-.5));
//			long a[]=new long[n];
//			for(int i=0;i<n;i++)
//				a[i]=Long.parseLong(q[i]);
////			long p=1;
//			int b=0;
//			BigInteger p=new BigInteger("1");
//			BigInteger p1=new BigInteger("1000000000000000000");
//			for(int i=0;i<n;i++) {
//				if(a[i]==0) {
//					b=0;
//					p=new BigInteger("0");
//					break;
//				}
//				if(b!=1) {
//				BigInteger w=new BigInteger(Long.toString(a[i]));
//				p=p.multiply(w);
//				if(p.compareTo(p1)==1)
//					{b=1;
////					break;
//					}
//				}
////				if(p>Math.pow(10, 18)||p<0||p<a[i])
////					{b=1;
////				break;}
//					}
////			System.out.println(b);
//			if(b==1)
//				System.out.println(-1);
//			else
//				System.out.println(p);
//			System.out.println();
//		}
	}

}
