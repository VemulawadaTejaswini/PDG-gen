import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x=new int[n+1];
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			String s=sc.next();
			if(s.equals("AC")) {
				if(x[a]==-1)
					x[a]+=1000010;
				else
					x[a]+=2;
			}else {
				x[a]--;
			}
		}
		int sum=0,num=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>0)
				sum++;
			if(x[i]>=99999 && x[i]%100000!=0)
				num++;
		}
		System.out.print(sum+" "+num);
	}
} 