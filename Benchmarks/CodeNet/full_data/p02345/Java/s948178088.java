import java.util.*;
import java.util.function.*;

/**
 * @author http://codeforces.com/blog/entry/18051
 */
class SegmentTree<T>{

	T	initv,array[];
	int	size;

	BinaryOperator<T> op;

	SegmentTree(int size,T initvalue,BinaryOperator<T> op){
		this.size=size;
		this.initv=initvalue;
		this.op=op;
		initArray();
	}
	@SuppressWarnings("unchecked")
	private void initArray(){
		array=(T[])new Object[size*2];
		Arrays.fill(array,initv);
	}

	void build_set(int i,T v){
		array[i+size]=v;
	}
	void build(){
		for(int i=size-1;i>0;--i)
			array[i]=op.apply(array[i*2],array[i*2|1]);
	}

	void update(int p,T value){
		for(array[p+=size]=value;p>1;p>>=1)
			array[p/2]=op.apply(array[p],array[p^1]);
	}

	T query(int lIn,int rEx){
		T res=initv;
		for(lIn+=size,rEx+=size;lIn<rEx;lIn/=2,rEx/=2){
			if((lIn&1)>0) res=op.apply(res,array[lIn++]);
			if((rEx&1)>0) res=op.apply(res,array[--rEx]);
		}
		return res;
	}
}

public class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		SegmentTree<Integer> t=new SegmentTree<>(s.nextInt(),Integer.MAX_VALUE,Math::min);
		for(int q=s.nextInt();q>0;--q){
			if(s.nextInt()==1)
				System.out.println(t.query(s.nextInt(),s.nextInt()+1));
			else
				t.update(s.nextInt(),s.nextInt());
		}
	}
}
