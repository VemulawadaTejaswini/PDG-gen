import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

class Main{
    static enum queryType{ MAX, MIN, SUM }

    int n;
    long[] data;
    private long[] lazy_add;
    private long[] lazy_set;
    private long data_def;
    private long set_def;
    private BinaryOperator<Long> qfunc;
    private BiFunction<Long, Integer, Long> lfunc;
    private UnaryOperator<Long> exfunc;
    // monoidの関数、データの初期値
    // 遅延評価の関数、遅延評価の初期値

    Main(int n_, queryType qtype){
        switch (qtype) {
            case MAX:
                data_def = Long.MIN_VALUE;
                set_def = Long.MAX_VALUE;
                qfunc = (Long l1, Long l2)->l1>l2 ? l1:l2;
                lfunc = (Long l, Integer i)->l;
                exfunc = (Long l)->l;
                break;
            case MIN:
                data_def = Long.MAX_VALUE;
                set_def = Long.MIN_VALUE;
                qfunc = (Long l1, Long l2)->l1<l2?l1:l2;
                lfunc = (Long l, Integer i)->l;
                exfunc = (Long l)->l;
                break;
            case SUM:
                data_def = 0;
                set_def = Long.MAX_VALUE;
                qfunc = (Long l1, Long l2)->l1+l2;
                lfunc = (Long l, Integer i)->l*i;
                exfunc = (Long l)->l/2;
                break;
            default:
                break;
        }
        n=1;
        while(n<n_)n*=2;
        data = new long[2*n+1];
        Arrays.fill(data, data_def);
        lazy_set = new long[2*n+1];
        lazy_add = new long[2*n+1];
        Arrays.fill(lazy_set, set_def);
        Arrays.fill(lazy_add, 0);
    }

    void set(int index, long value){
		index+=n;
		data[index]=value;
		for(index/=2;index>0;index/=2)data[index]=qfunc.apply(data[2*index], data[2*index+1]);
    }
    void add(int index, long value){
        index+=n;
        data[index]+=value;
        for(index/=2;index>0;index/=2)data[index]=qfunc.apply(data[2*index], data[2*index+1]);
    }

    void set(int a, int b, long value){set(a, b, value, 1, 0, n);}
    private void set(int a, int b, long value, int k, int l, int r){
        eval_set(k, l, r);
        if(r<=a || b<=l)return;
        if(a<=l && r<=b){
            lazy_set[k]=lfunc.apply(value, r-l);
            eval_set(k, l, r);
            return;
        }
        set(a, b, value, 2*k, l, (l+r)/2);
        set(a, b, value, 2*k+1, (l+r)/2, r);
        data[k] = qfunc.apply(data[2*k], data[2*k+1]);
    }    
    private void eval_set(int k, int l, int r){
        if(lazy_set[k]==set_def)return;
        data[k] = lazy_set[k];
        if(r-l>1){lazy_set[2*k]=lazy_set[2*k+1]=exfunc.apply(lazy_set[k]);}
        lazy_set[k]=set_def;
        lazy_add[k]=0;
    }

    void add(int a, int b, long value){add(a, b, value, 1, 0, n);}
    private void add(int a, int b, long value, int k, int l, int r){
        eval_add(k, l, r);
        if(r<=a || b<=l)return;
        if(a<=l && r<=b){
            lazy_add[k]=lfunc.apply(value, r-l);
            eval_add(k, l, r);
            return;
        }
        add(a, b, value, 2*k, l, (l+r)/2);
        add(a, b, value, 2*k+1, (l+r)/2, r);
        data[k] = qfunc.apply(data[2*k], data[2*k+1]);
    }
    private void eval_add(int k, int l, int r){
        eval_set(k, l, r);
        if(lazy_add[k]==0)return;
        if(r-l>1){
            eval_set(2*k, l, (l+r)/2);
            eval_set(2*k+1, (l+r)/2, r);
        }
        data[k] += lazy_add[k];
        if(r-l>1){
            lazy_add[2*k] += exfunc.apply(lazy_add[k]);
            lazy_add[2*k+1]+=exfunc.apply(lazy_add[k]);
        }
        lazy_add[k]=0;
    }

	long get(int a, int b){
		return get(a,b, 1, 0, n);
	}
	private long get(int a, int b, int k, int l, int r){
        eval_add(k, l, r);
		if(r<=a || b<=l)return data_def;
		if(a<=l&&r<=b)return data[k];
		return qfunc.apply(get(a,b,2*k, l,(l+r)/2), get(a,b,2*k+1,(l+r)/2,r));
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        Main st = new Main(n, Main.queryType.MIN);
        st.set(0, n, Integer.MAX_VALUE);
        while(q-->0){
            if(sc.nextInt()==0){
                int s = sc.nextInt(), t=sc.nextInt(), v=sc.nextInt();
                st.set(s, t+1, v);
            }else{
                int s = sc.nextInt(), t=sc.nextInt();
                System.out.println(st.get(s, t+1));
            }
        }



        // for(int i=0;i<10;++i)System.out.print(st.data[16+i]+" ");
        // System.out.println();
        // for(int i=0;i<32;++i)System.out.print(st.lazy_set[i]+" ");
        // System.out.println();

    }
}
