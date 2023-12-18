import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
 


public class Main {
	private static Scanner sc = new Scanner(System.in);
	//result = Math.pow(num1, num3)
	//StringBuffer str = new StringBuffer(hoge1);
	//String hoge2 = str.reverse().toString();
	//map.containsKey(A)

	//Map<String, Integer> map = new HashMap<String, Integer>(n);
	/*for ( キーのデータ型 key : マップの名前.keySet() ) {
		データのデータ型 data = マップの名前.get( key );
		
		// keyやdataを使った処理;
	}*/
	//int i = Integer.parseInt(s);
	//Queue<String> qq=new ArrayDeque<>(); //add,poll,peek
	//Deque<String> qq=new ArrayDeque<>();//push,pop,peek
	//ArrayList<String> cc = new ArrayList<>(n);
	//Collections.sort(list);
	//Array.sort(list);   cc.contains(tmp)
	//Arrays.asList(c).contains("a")
	//list.set(1,"walk");//1 1 2 3 5
	//static long mod =1000000007;
	//static 	ArrayList<Integer> cc = new ArrayList<>(100);
	
	
	static int N,M,X;
	static int c[]=new int[100001];
	
	public static void main(String[] args) {
		//int N=sc.nextInt();for(int i=0;i<N;i++) {}
		//int a[]=new int[N];
		N=sc.nextInt();
		M=sc.nextInt();
		X=sc.nextInt();
		int sum=0;
		int a[][]=new int[N][M];
		Integer v[]=new Integer[M];
		for(int i=0;i<M;i++)v[i]=0;
		
		for(int i=0;i<N;i++) {
			c[i]=sc.nextInt();
			sum+=c[i];
			for(int i1=0;i1<M;i1++) {
				//p(i1);
				a[i][i1]=sc.nextInt();
				v[i1]+=a[i][i1];
			}
		}
		boolean f=true;
		for(int i=0;i<M;i++) {
			if(v[i]<X) {
				f=false;
				break;
			}
		}
		
		if(f) {
			
			Queue<Integer> qq=new ArrayDeque<>(); //add,poll,peek
			qq.add(0);
			Queue<Integer> sum1=new ArrayDeque<>(); //add,poll,peek
			sum1.add(sum);
			Queue<Integer[]> vv=new ArrayDeque<>(); //add,poll,peek
			vv.add(v);
			int ans=1000000009;
			while(qq.peek() != null) {
				
				int t=qq.poll();
				p(t+"aaaaaaaaaa");
				int s=sum1.poll();
				Integer tt[]=vv.poll();
				if(t==N) {
					boolean ff=true;
					for(int i=0;i<M;i++) {
						if(tt[i]<X) {
							ff=false;
						}
						
					}p(s);
					if(ff) {
						ans=Math.min(ans, s);
					}
					continue;
				}
				
				qq.add(t+1);sum1.add(s);vv.add(tt);
				boolean ff=true;
				for(int i=0;i<M;i++) {
					if(tt[i]-a[t][i]<X) {
						ff=false;
						break;
					}
					tt[i]-=a[t][i];
				}
				if(ff) {
					qq.add(t+1);
					sum1.add(sum-c[t]);
					vv.add(tt);
				}
			}
			
			p(ans);
			
			
			
		}else p("-1");
		
		
	}
	
	
	static int dfs(int i) {
		
		
		
		
		
		return 0;
	}
	
	
	

	


	
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p() {System.out.println();};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	
}
	
