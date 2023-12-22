
import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new C();
	}
	
	class C{
		C(){
			int M=sc.nextInt();
			HashMap<String, Num> map=new HashMap<String, Num>();
			for(int i=0; i<M; i++){
				String str=sc.next();
				int a=sc.nextInt(),b=sc.nextInt();
				map.put(str, new Num(a, b, false, (a==0||b==0)));
			}
			int N=sc.nextInt();
			String[] e=new String[N];
			for(int i=0; i<N; i++)	e[i]=sc.next();
			
			// debug
			//System.out.println(Arrays.toString(e));
			
			boolean er=false;
			LinkedList<Num> s=new LinkedList<Num>();
			for(int i=0; i<N; i++){
				// debug
				//System.out.println(s);
				
				if(map.containsKey(e[i])){
					s.push(map.get(e[i]));
				}else{
					try{
						int tmp=Integer.parseInt(e[i]);
						s.push(new Num(tmp,tmp,true,tmp==0));
					}catch(Exception ex){
						Num b=s.pop(),a=s.pop();
						if(e[i].equals("+")){
							boolean z=(a.hi+b.hi)>255;
							s.push(new Num((a.lo+b.lo)%256, (a.hi+b.hi)%256, a.c&&b.c, z));
						}else if(e[i].equals("-")){
							boolean z=(a.lo-b.hi)<=0;
							s.push(new Num((a.lo-b.hi+256)%256, (a.hi-b.lo+256)%256, a.c&&b.c, z));
						}else if(e[i].equals("*")){
							boolean z=a.zero||b.zero;
							s.push(new Num((a.lo*b.lo)%256, (a.hi*b.hi)%256, a.c&&b.c, z));
						}
						else if(e[i].equals("/")){
							if(b.zero){
								er=true;
								break;
							}
							s.push(new Num((a.lo/b.hi)%256, (a.hi/b.lo)%256, a.c&&b.c, false));
						}
					}
				}
			}
			System.out.println(er?"error":"correct");
		}
		class Num{
			int lo,hi;
			boolean c,zero;
			Num(int lo,int hi,boolean c,boolean zero){
				this.lo=lo;
				this.hi=hi;
				this.c=c;
				this.zero=zero || lo==0 || hi==0;
			}
			@Override public String toString(){
				return "LO"+lo+" HI"+hi+" c-"+c+" z-"+zero;
			}
		}
	}
	
	
}