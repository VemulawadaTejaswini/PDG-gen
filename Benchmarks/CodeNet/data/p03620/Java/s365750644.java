import java.util.*;

class Main {
    static final int I=(1<<30)-1;
    static BitSet toBitSet(String a){
        BitSet r=new BitSet(a.length());
        for(int i=0;i<a.length();++i)
            r.set(i,a.charAt(i)=='1');
        return r;
    }
    static BitSet rotate(int n,BitSet b){
        BitSet r=new BitSet(n);
        for(int i=0;i<n-1;++i)
            r.set(i,b.get(i+1));
        r.set(n-1,b.get(0));
        return r;
    }
    static int f(BitSet a, BitSet[] br){
        int n=br.length;
        BitSet[] masks=new BitSet[n];
        masks[0]=(BitSet)br[0].clone();
        for(int i=1;i<n;++i){
            masks[i]=(BitSet)masks[i-1].clone();
            masks[i].or(br[i]);
        }
        int[]l=new int[n];
        for(int i=0;i<n;++i){
            int p=n,f=-1;
            while(p-f>1){
                int m=(p+f)/2;
                BitSet t1=(BitSet)a.clone();
                t1.andNot(masks[m]);
                BitSet t2=(BitSet)br[i].clone();
                t2.andNot(masks[m]);
                if(t1.equals(t2))
                    p=m;
                else
                    f=m;
            }
            l[i]=p;
        }
        int m=I;
        for(int i=0;i<n;++i)
            if(l[i]<n){
                BitSet t=(BitSet)a.clone();
                t.xor(br[i]);
                int d=t.cardinality();
                m=Math.min(m,l[i]+Math.min((i-l[i]+n)%n,(l[i]-i+n)%n)+d);
            }
        return m;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a=scan.next();
        String b=scan.next();
        int n=a.length();
        BitSet ab=toBitSet(a);
        BitSet bb=toBitSet(b);
        BitSet[]br=new BitSet[n];
        br[0]=bb;
        for(int i=1;i<n;++i)
            br[i]=rotate(n,br[i-1]);
        int m=f(ab,br);
        for(int i=0;i<(n-1)/2;++i){
            BitSet t=br[i+1];
            br[i+1]=br[n-1-i];
            br[n-1-i]=t;
        }
        m=Math.min(m,f(ab,br));
        System.out.println(m==I?-1:m);
    }
}
