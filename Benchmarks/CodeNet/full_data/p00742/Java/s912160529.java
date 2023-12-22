import java.awt.geom.Point2D;
import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1161();
	}
	class AOJ1161{
		int N,C;
		long cand,top;
		String[] s;
		AOJ1161(){
			while(true){
				N=sc.nextInt();
				if(N==0)	break;
				solve();
			}
		}
		void solve(){
			s=new String[N];
			int p=0;
			HashMap<Character,Integer> map=new HashMap<Character,Integer>();
			top=0;
			for(int i=0; i<N; ++i){
				char[] c=sc.next().toCharArray();
				for(int j=0; j<c.length; ++j){
					if(map.containsKey(c[j])){
						int tmp=map.get(c[j]);
						if(j==0 && c.length>1)	top |= (1<<tmp);
						c[j]=(char)('a'+tmp);
					}else{
						map.put(c[j], p);
						if(j==0 && c.length>1)	top |= (1<<p);
						c[j]=(char)('a'+p);
						++p;
					}
					s[i]=new String(c);
				}
			}
//			System.out.println(Arrays.toString(s));
//			System.out.println(map);
//			System.out.println(Long.toBinaryString(top));
			cand=0;
			C=map.size();
			int ans=dfs(new int[C],new boolean[10],0);
			System.out.println(ans);
		}
		int dfs(int[] cand,boolean[] used,int depth){
			if(depth>=C){
//				System.out.println("cand"+cand);
				return survey(cand)? 1: 0;
			}
			
			int ret=0;
			for(int i=(top&(1<<depth))>0? 1: 0; i<=9; ++i)if(!used[i]){
				int pre=cand[depth];
				cand[depth]=i;
				used[i]=true;
				ret+=dfs(cand, used, depth+1);
				used[i]=false;
				cand[depth]=pre;
			}
			return ret;
		}
		boolean survey(int[] cand){
			int a=0,b=calc(s[N-1],cand);
			for(int i=0; i<N-1; ++i){
				a+=calc(s[i], cand);
				if(a>b)	return false;
			}
			return a==b;
		}
		int calc(String s,int[] cand){
			char[] c=s.toCharArray();
			for(int i=0; i<c.length; ++i){
				c[i]=(char)(cand[c[i]-'a']+'0');
			}
			return Integer.parseInt(new String(c));
		}
	}
}