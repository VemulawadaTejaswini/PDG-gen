import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	static int maxn=200000+100;
	static int n;
	static node[]ns=new node[maxn];
	static int[]bit=new int[maxn];
	static int[]arr=new int[maxn];
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args)
	{
//		new Thread(new analyze()).start();
		read();
		System.out.println(cal());
	}
	
	//二分计算答案
	static long cal() {
		long l=0,r=4000000000L;//左开右闭
		long tot=(long)(n+1)*n/2;
		while(r-l>1) {
			long mid=(l+r)>>1;
			if(2*f(mid)>tot)
				r=mid;
			else
				l=mid;
		}
		return r;	
	}
	
	//计算中位数小于等于x的区间个数
	static long f(long x) {
		ns[1]=new node(-1,1);
		for(int i=2;i<n+2;i++) {
			ns[i]=new node((arr[i-1]>x?1:-1)+ns[i-1].sum,i);
		}
		Arrays.sort(ns,1,n+2);
		//清空bit
		for(int i=1;i<maxn;i++)bit[i]=0;
		long ans=0;
		add(ns[n+1].pos);
		for(int i=n;i>=1;i--){
			ans+=que(ns[i].pos);
			add(ns[i].pos);
		}
		return ans;
	}
	
	//树状数组查询操作
	static int que(int x) {
		int ans=0;
		while(x>0) {
			ans+=bit[x];
			x-=x&-x;
		}
		return ans;
	}
	
	//树状数组更新操作
	static void add(int x) {
		while(x<maxn) {
			bit[x]++;
			x+=x&-x;
		}
	}
	
	//读入数据
	static void read() {
		n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			arr[i]=scan.nextInt();
		}
	}
}
class node implements Comparable<node>{
	int sum;
	int pos;
	public node(int s,int p) {
		sum=s;pos=p;
	}
	@Override
	public int compareTo(node arg0)
	{
		return this.sum==arg0.sum?this.pos-arg0.pos:this.sum-arg0.sum;
	}
}