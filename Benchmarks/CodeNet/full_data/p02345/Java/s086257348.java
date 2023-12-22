

import java.util.Scanner;

public class Main {
	private static final int INF = Integer.MAX_VALUE;
	static int n = 1;
	static int[] D;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int op_num = sc.nextInt();
		String[] op = new String[op_num+1];
		for(int i= 0;i<op.length;i++)
			op[i] = sc.nextLine();
		//System.out.println(n);
		initRMQ(n);
		
		for(int i=1;i<=op_num;i++) {
			String[] Split= op[i].split(" ");
			int x = Integer.parseInt(Split[1]);
			int y = Integer.parseInt(Split[2]);
			if(Integer.parseInt(Split[0]) == 0 ) {
				//System.out.println("Update:"+x+" "+y);
				update(x,y);
			}else {
				//System.out.println("findMin:"+x+" "+y);
				int result = findMin(x,y);
				System.out.println(result);
			}
		}
	}
	private static int findMin(int a, int b) {
		// TODO Auto-generated method stub
		return query(a,b+1,0,0,n);
	}
	private static int query(int a, int b, int k, int l, int r) {
		// TODO Auto-generated method stub
		if(r<=a || b<=l)
			return INF;
		if (a<=l && r <=b)
			return D[k];
		
		int vl=query(a,b,k*2+1,l,(l+r)/2);
		int vr = query(a,b,k*2+2,(l+r)/2,r);
		return Math.min(vl, vr);
	}
	private static void update(int k, int a) {
	
		k =k+n-1;
		D[k] = a;
		while(k>0) {
			k = (k-1)/2;
			D[k] = Math.min(D[k*2+1],D[k*2+2]);
		}
	}
	private static void initRMQ(int N) {
		// TODO Auto-generated method stub
		n = 1;
		while(n<N)
			n*=2;
		D = new int[n*2 - 1];
		for(int i=0;i<2*n-1;i++)
			D[i] = INF;
	}
	
	

}

