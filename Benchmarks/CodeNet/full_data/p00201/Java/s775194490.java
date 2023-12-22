import java.util.*;
class Main{
	static HashMap<String,Integer> dat;
	static HashMap<String,Integer> memo;
	static String table[][];
	static String k[];
	static int size[];
	static int b;
	static int solve(String a){
		if(memo.containsKey(a))return memo.get(a);
		int ret=dat.get(a);
		for(int i=0;i<b;i++){
			if(k[i].equals(a)){
				int val=0;
				for(int j=0;j<size[i];j++){
					val+=solve(table[i][j]);
				}
				ret=Math.min(ret,val);
				break;
			}
		}
		memo.put(a,ret);
		return ret;
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a;
		k=new String[100];
		table=new String[100][100];
		size=new int[100];
		dat=new HashMap<String,Integer>();
		memo=new HashMap<String,Integer>();
		while(true){
			a=s.nextInt();
			dat.clear();
			memo.clear();
			if(a==0)System.exit(0);
			for(int i=0;i<a;i++){
				String str=s.next();
				int p=s.nextInt();
				dat.put(str,p);
			}
			b=s.nextInt();
			for(int i=0;i<b;i++){
				k[i]=s.next();
				size[i]=s.nextInt();
				for(int j=0;j<size[i];j++)table[i][j]=s.next();
			}
		//	System.exit(0);
			String m=s.next();
			System.out.println(solve(m));
		}
	}
}