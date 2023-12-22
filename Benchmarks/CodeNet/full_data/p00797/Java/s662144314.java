import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ1217(), "RUN!", STACK_SIZE).start();
	}
	
	class AOJ1217 implements Runnable{
		AOJ1217(){}
		
		int N,M;
		
		@Override public void run(){
			while(sc.hasNext()){
				N=sc.nextInt();
				M=sc.nextInt();
				if((N|M)==0)	break;
				solve();
				System.out.println();
			}
		}
		
		Person[] a;
		HashMap<String,Integer> dic;
		
		void solve(){
			a=new Person[N];
			dic=new HashMap<String, Integer>();
			int p=-1;
			sc.nextLine();
			for(int i=0; i<N; i++){
				StringBuilder line=new StringBuilder(sc.nextLine());
				int j=0;
				while(line.charAt(j)==' ')	++j;
				for(int k=i-1; k>=0; k--){
					if(a[k].n==j-1){
						p=k;
						break;
					}
				}
				if(j>0){
					if(p<0)	throw new RuntimeException("parent not found");
					a[p].child.add(i);
				}
				String name=line.toString().replaceAll(" ", "");
				a[i]=new Person(name, p,j);
				dic.put(name, i);
				p=-1;
			}
			
			for(int i=0; i<M; i++){
				String line=sc.nextLine().replaceAll("\\.", "");
				String[] q=line.split(" ");
				boolean ans=false;
				if(q[3].equals("child")){
					int now=dic.get(q[5]);
					for(int j:a[now].child){
						if(a[j].name.equals(q[0])){
							ans=true;
							break;
						}
					}
				}else if(q[3].equals("parent")){
					int tmp=a[dic.get(q[5])].parent;
					ans=(tmp>=0 && a[tmp].name.equals(q[0]));
				}else if(q[3].equals("sibling")){
					int now=a[dic.get(q[5])].parent;
					if(now>=0){
						for(int j:a[now].child){
							if(a[j].name.equals(q[0])){
								ans=true;
								break;
							}
						}
					}
				}else if(q[3].equals("descendant")){
					ans=findChild(dic.get(q[5]),q[0]);
				}else if(q[3].equals("ancestor")){
					int now=dic.get(q[5]);
					while(a[now].parent>=0){
						now=a[now].parent;
						if(a[now].name.equals(q[0])){
							ans=true;
							break;
						}
					}
				}
				System.out.println(ans?"True":"False");
			}
		}
		
		boolean findChild(int now,String target){
			if(a[now].name.equals(target))	return true;
			for(int i:a[now].child){
				if(findChild(i,target))	return true;
			}
			return false;
		}
		
		class Person{
			int parent,n;
			ArrayList<Integer> child;
			String name;
			Person(String name,int parent,int n){
				this.name=name;
				this.parent=parent;
				this.n=n;
				this.child=new ArrayList<Integer>();
			}
			@Override public String toString(){
				return name+" P:"+parent+" C:"+child+" N:"+n;
			}
		}
	}
}