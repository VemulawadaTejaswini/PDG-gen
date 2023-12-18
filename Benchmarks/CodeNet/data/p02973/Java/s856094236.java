import java.util.*;
public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,l,n,x,y,z;
	int ans;
	ArrayList<M> m = new ArrayList<>();

	Main(){
		// 整数の入力
		n = sc.nextInt();
		m.add(new M(sc.nextInt()));

		for(int i=0;i<n-1;i++){
			a = sc.nextInt();
			Iterator it = m.iterator();
			boolean flg = true;
			while(it.hasNext()&&flg){
				M m2 = (M)it.next();
				if(m2.dist(a)>0){
					m2.set(a);
					flg = false;
				}
			}
			if(flg)m.add(new M(a));
		}

		// 出力
		System.out.println(m.size());
	}

	public static void main(String[] args){
		new Main();
	}
}

class M{
	int num;

	M(int num){
		this.num = num;
	}

	void set(int num){
		this.num = num;
	}

	int dist(int num){
		return Math.max(0,num-this.num);
	}
}