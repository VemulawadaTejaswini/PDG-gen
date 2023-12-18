import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		int[] in = new int[s.nextInt()];
		int x = s.nextInt();
		for (int i=0;i<in.length;i++) {
			in[i]+=Integer.parseInt(s.next());
		}
		maxIndex m = new maxIndex(in);

		long r=0;
		int b,i;
		while (m.hasNext()) {
			i = m.next();
			if(i==0||i==in.length-1)
				continue;
			if((b=Math.max(in[i-1]+in[i], in[i+1]+in[i]))<=x)
				break;
			else {
				if(in[i]<b-x) {
					r+=in[i];
					in[i]=0;
				}else {
					in[i]-=b-x;
					r+=b-x;
				}
			}
		}
		b=in[0]+in[1];
		if(b>x) {
			if(in[0]<b-x) {
				r+=in[0];
				in[0]=0;
			}else {
				in[0]-=b-x;
				r+=b-x;
			}
		}
		b=in[in.length-1]+in[in.length-2];
		if(b>x) {
			if(in[in.length-1]<b-x) {
				r+=in[in.length-1];
				in[in.length-1]=0;
			}else {
				in[in.length-1]-=b-x;
				r+=b-x;
			}
		}
		System.out.println(r);
	}
}

class maxIndex implements Iterator<Integer>{
	PriorityQueue<IntPair> pairs = new PriorityQueue<>();
	maxIndex(int[] in) {
		for(int i=0;i<in.length;i++)
			pairs.add(new IntPair(in[i], i));
	}
	@Override
	public boolean hasNext() {
		return !pairs.isEmpty();
	}
	@Override
	public Integer next() {
		return pairs.poll().i2;
	}
}
class IntPair implements Comparable<IntPair>{
	int i1,i2;
	IntPair(int a,int b) {
		i1=a;
		i2=b;
	}
	@Override
	public int compareTo(IntPair o) {
		return o.i1-this.i1;
	}
}